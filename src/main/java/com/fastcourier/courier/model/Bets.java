package com.fastcourier.courier.model;

import javax.persistence.*;

@Entity(name = "bets")
public class Bets {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long userId;

    private Long fightId;

    private Long fighterId;

    private boolean win;

    public Bets() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFightId() {
        return fightId;
    }

    public void setFightId(Long fightId) {
        this.fightId = fightId;
    }

    public Long getFighterId() {
        return fighterId;
    }

    public void setFighterId(Long fighterId) {
        this.fighterId = fighterId;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }
}
