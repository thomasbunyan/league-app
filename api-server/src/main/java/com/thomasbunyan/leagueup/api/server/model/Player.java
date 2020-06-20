package com.thomasbunyan.leagueup.api.server.model;

import java.time.LocalDate;
import java.time.Period;

public class Player {

    private final String firstName;
    private final String lastName;
    private final LocalDate dob;

    public Player(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
