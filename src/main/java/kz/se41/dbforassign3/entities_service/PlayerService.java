package kz.se41.dbforassign3.entities_service;

import kz.se41.dbforassign3.entities.Player;
import kz.se41.dbforassign3.entities_repositories.PlayerRep;
import kz.se41.dbforassign3.entities_repositories.SportClubRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    public Player getById(Long id) {
        return playerRep.findById(id)
                .orElseThrow(() -> new RuntimeException("Player not found"));
    }

    @Autowired
    private PlayerRep playerRep;
    public List<Player> getAllPlayers(){
        return playerRep.findAll();
    }
    public Player create(Player player) {
        player.setId(null);
        return playerRep.save(player);
    }
    public Player update(Long id, Player updated) {
        Player player = getById(id);

        player.setName(updated.getName());
        player.setHeight(updated.getHeight());
        player.setWeight(updated.getWeight());
        player.setSkill(updated.getSkill());
        return playerRep.save(player);
    }
    public void delete(Long id) {
        if (!playerRep.existsById(id)) {
            throw new RuntimeException("Player not found");
        }
        playerRep.deleteById(id);
    }
}
