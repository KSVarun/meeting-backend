package com.example.demo.service;

import com.example.demo.GoogleSignInApplication;
import com.example.demo.bean.Attendee;
import com.example.demo.bean.Schedule;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventAttendee;
import com.google.api.services.calendar.model.EventDateTime;
import org.springframework.stereotype.Repository;


import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ScheduleService {
    private static final String APPLICATION_NAME = "video-search";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private String hangOutLink;




    public String createScheduleService(Schedule schedule) throws IOException, GeneralSecurityException {
        // Build a new authorized API client service.
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();

        Calendar service = new Calendar.Builder(HTTP_TRANSPORT, JSON_FACTORY, GoogleSignInApplication.getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();

        Event event = new Event()
                .setSummary(schedule.getSummary())
                .setDescription(schedule.getDescription());

        DateTime startDateTime = new DateTime(schedule.getStartDateTime());
        EventDateTime start = new EventDateTime()
                .setDateTime(startDateTime)
                .setTimeZone("Asia/Kolkata");
        event.setStart(start);

        DateTime endDateTime = new DateTime(schedule.getEndDateTime());
        EventDateTime end = new EventDateTime()
                .setDateTime(endDateTime)
                .setTimeZone("Asia/Kolkata");
        event.setEnd(end);

        List<EventAttendee> attendeeList = new ArrayList<>();
        for (Attendee a : schedule.getAttendees()) {
            attendeeList.add(new EventAttendee().setEmail(a.getEmail()));
        }
        
        event.setAttendees(attendeeList);


        Event.Reminders reminders = new Event.Reminders()
                .setUseDefault(false);
        event.setReminders(reminders);


        String calendarId = "primary";
        event = service.events().insert(calendarId, event).execute();

        hangOutLink=event.getHangoutLink();

        return hangOutLink;
    }
}
