package com.thomasbunyan.leagueup.api.server.dao;

import com.thomasbunyan.leagueup.api.server.model.Player;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePlayerDAService implements PlayerDao {

    private static List<Player> DB = new ArrayList<Player>();

    @Override
    public int insertPlayer(UUID id, Player player) {
        DB.add(new Player(id, player.getFirstName(), player.getLastName(), player.getDob()));
        return 1;
    }

    @Override
    public List<Player> selectAllPlayers() {
        return DB;
    }

    @Override
    public Optional<Player> selectPlayerByID(UUID id) {
        return DB.stream()
                .filter(player -> player.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deletePlayerByID(UUID id) {
        Optional<Player> playerMaybe = selectPlayerByID(id);
        if(!playerMaybe.isPresent()){
            return 0;
        } else {
            DB.remove(playerMaybe.get());
            return 1;
        }
    }

    @Override
    public int updatePlayerByID(UUID id, Player player) {
        return selectPlayerByID(id)
                .map(p -> {
                    int indexOfPlayerToUpdate = DB.indexOf(p);
                    if(indexOfPlayerToUpdate >= 0){
                        DB.set(indexOfPlayerToUpdate, new Player(id, player.getFirstName(),player.getLastName(), player.getDob()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
