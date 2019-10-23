package com.fastcourier.courier.service;

import com.fastcourier.courier.model.Fights;
import com.fastcourier.courier.repository.FightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FightsService {

    @Autowired
    private FightRepository fightRepository;

    public Fights addFight(Fights fights) {
        return fightRepository.save(fights);
    }

    public ArrayList<Fights> findFightByEventID(Long eventId) {
        return (ArrayList<Fights>) fightRepository.findAllByEventId(eventId);
    }
}
