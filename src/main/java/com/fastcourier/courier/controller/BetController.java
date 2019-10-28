package com.fastcourier.courier.controller;

import com.fastcourier.courier.model.Event;
import com.fastcourier.courier.model.Fighter;
import com.fastcourier.courier.model.Users;
import com.fastcourier.courier.service.EventsService;
import com.fastcourier.courier.service.FighterService;
import com.fastcourier.courier.service.FightsService;
import com.fastcourier.courier.model.Fights;
import com.fastcourier.courier.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BetController {

    @Autowired
    private FightsService fightsService;

    @Autowired
    private EventsService eventsService;

    @Autowired
    private FighterService fighterService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addFight", method = RequestMethod.POST)
    public void addFight(@RequestBody Fights fights) {
        fightsService.addFight(fights);
    }

    @RequestMapping(value = "/getFightsByEventId", method = RequestMethod.GET)
    public ArrayList<Fights> getFightsByEventId(@RequestParam Long eventId) {
        return fightsService.findFightByEventID(eventId);
    }

    @RequestMapping(value = "/addEvent", method = RequestMethod.POST)
    public Event addEvent(@RequestBody Event event) {
        return eventsService.addEvent(event);
    }

    @RequestMapping(value = "/getAllEvents", method = RequestMethod.GET)
    public List<Event> getAllEvents() {
        return eventsService.getAllEvents();
    }

    @RequestMapping(value = "/addFighter", method = RequestMethod.POST)
    public Fighter addFighter(@RequestBody Fighter fighter) {
        return fighterService.addFighter(fighter);
    }

    @RequestMapping(value = "/getAllFighters", method = RequestMethod.GET)
    public List<Fighter> getAllFighters() {
        return fighterService.getAllFighters();
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public Users addUser(@RequestBody Users users) {
        return userService.addUser(users);
    }

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public Users getUsersById(@RequestParam Long userId) {
        return userService.findUserById(userId);
    }
}
