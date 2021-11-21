package by.bsac.park.repository;


import by.bsac.park.entity.TypePlant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypePlantRepo extends JpaRepository <TypePlant,Integer> {
}
