package com.example.demo.controller;

import com.example.demo.bean.Schedule;
import com.example.demo.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.GeneralSecurityException;

@RestController
public class ScheduleController {


    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping("/schedule")
    public String createSchedule(@RequestBody Schedule schedule) {
        return scheduleService.createScheduleService(schedule);
    }

    @DeleteMapping("/delete")
    public String deleteSchedule() throws IOException, GeneralSecurityException {
        return scheduleService.deleteEvent();
    }

    @GetMapping("/greet")
    public String greet(){
        return "Hello";
    }

    @PutMapping("/update")
    public String updateSchedule(@RequestBody Schedule schedule) throws  IOException, GeneralSecurityException{
        return scheduleService.updateEvent(schedule);
    }

}
