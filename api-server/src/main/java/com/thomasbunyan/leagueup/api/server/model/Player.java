package com.thomasbunyan.leagueup.api.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

public class Player {

    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final LocalDate dob;

    public Player(@JsonProperty("id") UUID id,
                  @JsonProperty("firstName") String firstName,
                  @JsonProperty("lastName") String lastName,
                  @JsonProperty("dob") LocalDate dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public UUID getId() {
        return id;
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
