package kz.se41.dbforassign3.entities_service;

import kz.se41.dbforassign3.entities.Player;
import kz.se41.dbforassign3.entities_repositories.PlayerRep;
import kz.se41.dbforassign3.entities.Sport;
import kz.se41.dbforassign3.entities_repositories.SportRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportService {
    public Sport getById(Long id) {
        return sportRep.findById(id)
                .orElseThrow(() -> new RuntimeException("Sport not found"));
    }
    @Autowired
    private SportRep sportRep;
    @Autowired
    private PlayerRep playerRep;
    public List<Sport> getAllSports(){
        return sportRep.findAll();
    }

    public Sport create(Long playerId, Sport sport) {
        Player player = playerRep.findById(playerId)
                .orElseThrow(() -> new RuntimeException("Player not found"));
        sport.setId(null);
        sport.setPlayer(player);
        return sportRep.save(sport);
    }

    public Sport update(Long id, Sport updated) {
        Sport sport = getById(id);

        sport.setDescription(updated.getDescription());
        sport.setName(updated.getName());
        return sportRep.save(sport);
    }
    public void delete(Long id) {
        if (!sportRep.existsById(id)) {
            throw new RuntimeException("Sport not found");
        }
        sportRep.deleteById(id);
    }

}
