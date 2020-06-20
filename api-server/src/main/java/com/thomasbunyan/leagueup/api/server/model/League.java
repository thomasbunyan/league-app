package com.thomasbunyan.leagueup.api.server.model;

public class League {

    private final String ticker;
    private final String name;
    private final int capacity;

    public League(String ticker, String name, int capacity) {
        this.ticker = ticker;
        this.name = name;
        this.capacity = capacity;
    }

    public String getId() {
        return ticker;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
