package com.fastcourier.courier.service;


import com.fastcourier.courier.model.Event;
import com.fastcourier.courier.repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsService {

    @Autowired
    private EventsRepository eventsRepository;

    public Event addEvent(Event event) {
        return eventsRepository.save(event);
    }

    public List<Event> getAllEvents(){
        return eventsRepository.findAll();
    }
}
