package com.palladiumpower.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Qualifier("gregorian")
public class GregorianCalendarService implements CalendarService {

    @Override
    public String getToday() {
        return LocalDate.now().toString();
    }
}
