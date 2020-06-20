package com.thomasbunyan.leagueup.api.server.model;

import java.time.LocalDate;

public class Team {

    private final String name;
    private final String ground;
    private final LocalDate founded;
    private final String shortName;

    public Team(String name, String ground, LocalDate founded, String shortName) {
        this.name = name;
        this.ground = ground;
        this.founded = founded;
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public String getGround() {
        return ground;
    }

    public LocalDate getFounded() {
        return founded;
    }

    public String getShortName() {
        return shortName;
    }
}
