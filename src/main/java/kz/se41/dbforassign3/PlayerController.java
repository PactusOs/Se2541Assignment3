package kz.se41.dbforassign3;

import kz.se41.dbforassign3.entities.Player;
import kz.se41.dbforassign3.entities_service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {


    @Autowired
    private PlayerService playerService;

    @GetMapping("/player")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }
}
