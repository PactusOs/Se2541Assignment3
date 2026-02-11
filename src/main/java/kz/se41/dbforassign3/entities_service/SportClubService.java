package kz.se41.dbforassign3.entities_service;

import kz.se41.dbforassign3.entities.Player;
import kz.se41.dbforassign3.entities.SportClub;
import kz.se41.dbforassign3.entities_repositories.SportClubRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kz.se41.dbforassign3.entities_repositories.PlayerRep;

import java.util.List;

@Service

public class SportClubService {
    public SportClub getById(Long id) {
        return sportclubRep.findById(id)
                .orElseThrow(() -> new RuntimeException("Sportclub not found"));
    }

    @Autowired
    private SportClubRep sportclubRep;
    @Autowired
    private PlayerRep playerRep;

    public List<SportClub> getAllSportClubs() {
        return sportclubRep.findAll();
    }

    public SportClub create(Long playerId, SportClub sportclub) {
        Player player = playerRep.findById(playerId)
                .orElseThrow(() -> new RuntimeException("Player not found"));

        sportclub.setId(null);
        sportclub.setPlayer(player);

        return sportclubRep.save(sportclub);
    }

    public SportClub update(Long id, SportClub updated) {
        SportClub sportClub = getById(id);

        sportClub.setClubs(updated.getClubs());
        sportClub.setMemberscount(updated.getMemberscount());
        sportClub.setClubdescription(updated.getClubdescription());
        return sportclubRep.save(sportClub);
    }
    public void delete(Long id) {
        if (!sportclubRep.existsById(id)) {
            throw new RuntimeException("Sportclub not found");
        }
        sportclubRep.deleteById(id);
    }
}
