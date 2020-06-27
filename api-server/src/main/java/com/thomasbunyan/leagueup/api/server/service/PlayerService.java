package com.thomasbunyan.leagueup.api.server.service;

import com.thomasbunyan.leagueup.api.server.dao.PlayerDao;
import com.thomasbunyan.leagueup.api.server.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class PlayerService {

    private final PlayerDao playerDao;

    @Autowired
    public PlayerService(@Qualifier("fakeDao") PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    public int addPlayer(Player player){
        return playerDao.insertPlayer(player);
    }

    public List<Player> getAllPlayers(){
        return playerDao.selectAllPlayers();
    }

    public Optional<Player> getPlayerByID(UUID id){
        return playerDao.selectPlayerByID(id);
    }

    public int deletePlayer(UUID id){
        return playerDao.deletePlayerByID(id);
    }

    public int updatePlayer(UUID id, Player player){
        return playerDao.updatePlayerByID(id, player);
    }

}
