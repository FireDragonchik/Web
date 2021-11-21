package by.bsac.park.repository;

import by.bsac.park.entity.Plant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepo extends JpaRepository<Plant,Integer> {

}
