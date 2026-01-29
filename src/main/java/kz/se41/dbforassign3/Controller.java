package kz.se41.dbforassign3;
import kz.se41.dbforassign3.entities.SportClub;
import kz.se41.dbforassign3.entities_service.PlayerService;
import kz.se41.dbforassign3.entities_service.SportClubService;
import kz.se41.dbforassign3.entities_service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    public class Controller {

    @Autowired
    private SportService sportService;
    @Autowired
    private SportClubService sportClubService;
    @Autowired
    private PlayerService playerService;

        @GetMapping("/sportclub")//http://localhost:8080/sportclub
        public List<SportClub> getAllSportClubs() {
            return sportClubService.getAllSportClubs();
        }
    }
