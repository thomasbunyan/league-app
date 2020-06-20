package com.thomasbunyan.leagueup.api.server.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeagueTest {

    private static final String LEAGUE_TICKER = "TSTLG";
    private static final String LEAGUE_NAME = "Test League";
    private static final int LEAGUE_CAPACITY = 20;

    private static League testLeague;

    @Before
    public void setUp(){
        testLeague = new League(LEAGUE_TICKER, LEAGUE_NAME, LEAGUE_CAPACITY);
    }

    @Test
    public void shouldReturnValidDetails(){
        assertEquals(LEAGUE_CAPACITY, testLeague.getCapacity());
    }

}