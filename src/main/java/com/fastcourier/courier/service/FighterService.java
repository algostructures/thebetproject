package com.fastcourier.courier.service;

import com.fastcourier.courier.model.Fighter;
import com.fastcourier.courier.repository.FighterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FighterService {

    @Autowired
    private FighterRepository fighterRepository;

    public Fighter addFighter(Fighter fighter){
        return fighterRepository.save(fighter);
    }

    public List<Fighter> getAllFighters() {
        return fighterRepository.findAll();
    }

}
