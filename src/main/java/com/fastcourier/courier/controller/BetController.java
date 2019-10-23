package com.fastcourier.courier.controller;

import com.fastcourier.courier.service.FightsService;
import com.fastcourier.courier.model.Fights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BetController {

    @Autowired
    private FightsService fightsService;

    @RequestMapping(value = "/addFight", method = RequestMethod.POST)
    public void addFight(@RequestBody Fights fights) {
        fightsService.addFight(fights);
    }

    @RequestMapping(value = "/getFightsByEventId", method = RequestMethod.GET)
    public ArrayList<Fights> getFightsByEventId(@RequestParam Long eventId) {
        return fightsService.findFightByEventID(eventId);
    }

}
