package kz.se41.dbforassign3.entities_service;

import kz.se41.dbforassign3.entities.SportClub;
import kz.se41.dbforassign3.entities_repositories.SportClubRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportClubService {
    @Autowired
    private SportClubRep sportClubRep;
    public List<SportClub> getAllSportClubs(){
        return sportClubRep.findAll();
    }
}
