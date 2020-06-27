package com.thomasbunyan.leagueup.api.server.controller;

import com.thomasbunyan.leagueup.api.server.model.Player;
import com.thomasbunyan.leagueup.api.server.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/player")
@RestController
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping
    public void addPlayer(@RequestBody Player player){
        playerService.addPlayer(player);
    }

    @GetMapping
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @GetMapping(path = "{id}")
    public Player getPlayerByID(@PathVariable("id") UUID id){
        return playerService.getPlayerByID(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePlayerByID(@PathVariable("id") UUID id){
        playerService.deletePlayer(id);
    }

    @PutMapping(path = "{id}")
    public void updatePlayer(@PathVariable UUID id, @RequestBody Player newPlayer){
        playerService.updatePlayer(id, newPlayer);
    }
}
