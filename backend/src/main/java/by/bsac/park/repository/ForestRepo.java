package by.bsac.park.repository;

import by.bsac.park.entity.Forest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForestRepo extends JpaRepository<Forest,Integer> {

}
