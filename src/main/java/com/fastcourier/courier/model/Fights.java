package com.fastcourier.courier.model;

import javax.persistence.*;

@Entity(name = "fights")
public class Fights {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long eventId;

    private Long fighterOneId;

    private Long fighterTwoId;

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

    public Long getFighterOneId() {
        return fighterOneId;
    }

    public void setFighterOneId(Long fighterOneId) {
        this.fighterOneId = fighterOneId;
    }

    public Long getFighterTwoId() {
        return fighterTwoId;
    }

    public void setFighterTwoId(Long fighterTwoId) {
        this.fighterTwoId = fighterTwoId;
    }
}
