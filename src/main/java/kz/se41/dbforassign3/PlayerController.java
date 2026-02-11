package kz.se41.dbforassign3;

import kz.se41.dbforassign3.entities.Player;
import kz.se41.dbforassign3.entities_service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @PostMapping
    public Player create(@RequestBody Player player) {
        return playerService.create(player);
    }

    @PutMapping("/{id}")
    public Player update(@PathVariable Long id,
                         @RequestBody Player player) {
        return playerService.update(id, player);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        playerService.delete(id);
    }
}
