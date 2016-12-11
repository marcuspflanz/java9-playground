package com.palladiumpower.controller;

import com.palladiumpower.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
class CalendarRegistry {

    @Autowired
    @Qualifier("gregorian")
    private CalendarService gregorianCalendar;

    @Autowired
    @Qualifier("mayan")
    private CalendarService mayanCalendar;

    CalendarService getCalendarByType(String calendarType) {
        switch (calendarType) {
            case "gregorian":
                return gregorianCalendar;

            case "mayan":
                return mayanCalendar;

            default:
                throw new IllegalArgumentException();
        }
    }
}
