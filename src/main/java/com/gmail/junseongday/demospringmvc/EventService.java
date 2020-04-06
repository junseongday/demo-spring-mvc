package com.gmail.junseongday.demospringmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {
    public List<Event> getEvent() {
        Event event1 = Event.builder()
                .name("스프링 웹 MVC 스터디 1차")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2020,4,8,9,00))
                .endDateTime(LocalDateTime.of(2020,4,8,18,00))
                .build();
        Event event2 = Event.builder()
                .name("스프링 웹 MVC 스터디 2")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2020,4,15 ,9,00))
                .endDateTime(LocalDateTime.of(2020,4,15,18,00))
                .build();
        return List.of(event1, event2);
    }
}
