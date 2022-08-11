package com.designpatters.sportsbuzz.concrete;

import java.util.Date;

public class Participant {
    private String id;
    private String name;
    private Date registrationDate;
    private Sport sport;
    public Participant(String id, String name, Date registrationDate, Sport sport) {
        this.id = id;
        this.name = name;
        this.registrationDate = registrationDate;
        this.sport = sport;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public Sport getSport() {
        return sport;
    }
}
