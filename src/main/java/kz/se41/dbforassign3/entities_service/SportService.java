package kz.se41.dbforassign3.entities_service;

import kz.se41.dbforassign3.entities.Sport;
import kz.se41.dbforassign3.entities_repositories.SportRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportService {
    @Autowired
    private SportRep sportRep;
    public List<Sport> getAllSports(){
        return sportRep.findAll();
    }
}
