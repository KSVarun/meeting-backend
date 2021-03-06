package com.example.demo.bean;



import java.util.ArrayList;
import java.util.List;

public class Schedule {

    private String description;
    private String endDateTime;
    private String startDateTime;
    private String summary;
    private ArrayList<String> attendees;

    public Schedule( String description, String endDateTime, String startDateTime, String summary, ArrayList<String> attendees) {

        this.description = description;
        this.endDateTime = endDateTime;
        this.startDateTime = startDateTime;
        this.summary = summary;
        this.attendees = attendees;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ArrayList<String> getAttendees() {
        return attendees;
    }

    public void setAttendees(ArrayList<String> attendees) {
        this.attendees = attendees;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    @Override
    public String toString() {
        return "Schedule{" +

                ", description='" + description + '\'' +
                ", endDateTime='" + endDateTime + '\'' +
                ", startDateTime='" + startDateTime + '\'' +
                ", summary='" + summary  +

                '}';
    }
}
