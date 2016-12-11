package com.palladiumpower.controller;

import com.palladiumpower.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GregorianCalendarController {

    @Autowired
    private CalendarRegistry calendarRegistry;

    @RequestMapping("{calendarType}/today")
    public String getToday(
            @PathVariable String calendarType
    ) {
        CalendarService calendar = calendarRegistry.getCalendarByType(calendarType);
        return calendar.getToday();
    }
}
