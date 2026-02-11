package kz.se41.dbforassign3;

import kz.se41.dbforassign3.entities.SportClub;
import kz.se41.dbforassign3.entities_service.SportClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sportclub")
public class SportClubController {
    @Autowired
    private SportClubService sportClubService;

    @GetMapping
    public List<SportClub> getAllSportClubs() {
        return sportClubService.getAllSportClubs();
    }

    @PostMapping
    public SportClub create(@RequestParam Long playerId,
                            @RequestBody SportClub sportClub) {
        return sportClubService.create(playerId, sportClub);
    }

    @PutMapping("/{id}")
    public SportClub update(@PathVariable Long id, @RequestBody SportClub sportClub) {
        return sportClubService.update(id, sportClub);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        sportClubService.delete(id);
    }

}
