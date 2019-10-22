package com.fastcourier.courier.Service;

import com.fastcourier.courier.repository.FighterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FighterService {

    @Autowired
    private FighterRepository fighterRepository;

}
