package com.example.demo.controller;

import com.example.demo.bean.Schedule;
import com.example.demo.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/greet")
    public String greet(){
        return "Hello";
    }

}
