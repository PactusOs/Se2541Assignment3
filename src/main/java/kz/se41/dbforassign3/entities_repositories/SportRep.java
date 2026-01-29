package kz.se41.dbforassign3.entities_repositories;

import kz.se41.dbforassign3.entities.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportRep  extends JpaRepository<Sport,Long> {
}
