package kz.se41.dbforassign3.entities_service;

import kz.se41.dbforassign3.entities.Player;
import kz.se41.dbforassign3.entities_repositories.PlayerRep;
import kz.se41.dbforassign3.entities_repositories.SportClubRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRep playerRep;
    public List<Player> getAllPlayers(){
        return playerRep.findAll();
    }
}
