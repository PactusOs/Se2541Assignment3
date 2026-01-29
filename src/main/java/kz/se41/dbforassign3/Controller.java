package kz.se41.dbforassign3;
import kz.se41.dbforassign3.entities.Sport;
import kz.se41.dbforassign3.entities.SportClub;
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

        @GetMapping("/index_se")//http://localhost:8080/index
        public List<SportClub> getAllSportClubs() {
            return sportClubService.getAllSportClubs();
        }
        public List<Sport> getSports() {
            return sportService.getAllSports();
        }
    }
