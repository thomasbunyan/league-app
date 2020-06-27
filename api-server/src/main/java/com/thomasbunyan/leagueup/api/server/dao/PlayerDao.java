package com.thomasbunyan.leagueup.api.server.dao;

import com.thomasbunyan.leagueup.api.server.model.Player;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PlayerDao {

    int insertPlayer(UUID id, Player player);

    default int insertPlayer(Player player){
        UUID id = UUID.randomUUID();
        return insertPlayer(id, player);
    }

    List<Player> selectAllPlayers();

    Optional<Player> selectPlayerByID(UUID id);

    int deletePlayerByID(UUID id);

    int updatePlayerByID(UUID id, Player player);


}
