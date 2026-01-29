package kz.se41.dbforassign3;

import kz.se41.dbforassign3.entities.Sport;
import kz.se41.dbforassign3.entities_service.PlayerService;
import kz.se41.dbforassign3.entities_service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class SportController {

    @Autowired
    private SportService sportService;
    @GetMapping("/sport")
    public List<Sport> getAllSports() {
        return sportService.getAllSports();
    }
}
