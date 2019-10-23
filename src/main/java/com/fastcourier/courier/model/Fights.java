package com.fastcourier.courier.model;

import javax.persistence.*;

@Entity
public class Fights {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long eventId;

    @ManyToOne
    private Fighter fighterOne;

    @ManyToOne
    private Fighter fighterTwo;

    public Fights() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Fighter getFighterOne() {
        return fighterOne;
    }

    public void setFighterOne(Fighter fighterOne) {
        this.fighterOne = fighterOne;
    }

    public Fighter getFighterTwo() {
        return fighterTwo;
    }

    public void setFighterTwo(Fighter fighterTwo) {
        this.fighterTwo = fighterTwo;
    }
}
