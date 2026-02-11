package kz.se41.dbforassign3;

import kz.se41.dbforassign3.entities.Sport;
import kz.se41.dbforassign3.entities_service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/sport")
public class SportController {
    @Autowired
    private SportService sportService;

    @GetMapping
    public List<Sport> getAllSports() {
        return sportService.getAllSports();
    }

    @PostMapping
    public Sport create(@RequestParam Long playerId,
                            @RequestBody Sport sport) {
        return sportService.create(playerId, sport);
    }

    @PutMapping("/{id}")
    public Sport update(@PathVariable Long id,
                         @RequestBody Sport player) {
        return sportService.update(id, player);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        sportService.delete(id);
    }
}

