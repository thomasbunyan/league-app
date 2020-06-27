package com.thomasbunyan.leagueup.api.server.model;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private static final UUID PLAYER_ID = UUID.randomUUID();
    private static final String PLAYER_FIRST_NAME = "Thomas";
    private static final String PLAYER_LAST_NAME = "Bunyan";
    private static final LocalDate PLAYER_DOB = LocalDate.of(1997, 9, 9);

    private static Player testPlayer;

    @Before
    public void setUp(){
        testPlayer = new Player(PLAYER_ID, PLAYER_FIRST_NAME, PLAYER_LAST_NAME, PLAYER_DOB);
    }

    @Test
    public void shouldReturnCorrectAge(){
        int age = testPlayer.getAge();
        assertEquals(22, age);
    }

}