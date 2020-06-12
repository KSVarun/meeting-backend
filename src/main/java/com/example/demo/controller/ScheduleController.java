package com.example.demo.controller;

import com.example.demo.bean.Schedule;
import com.example.demo.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.GeneralSecurityException;

@RestController
public class ScheduleController {


    @Autowired
    private ScheduleService scheduleService;

    @PostMapping("/schedule")
    public String createSchedule(@RequestBody Schedule schedule) throws IOException, GeneralSecurityException {
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

}
