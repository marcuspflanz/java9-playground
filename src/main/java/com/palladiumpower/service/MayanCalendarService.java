package com.palladiumpower.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("mayan")
public class MayanCalendarService implements CalendarService {

    @Override
    public String getToday() {
        throw new UnsupportedOperationException("not yet implemented");
    }
}
