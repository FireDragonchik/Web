package by.bsac.park.repository;

import by.bsac.park.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepo extends JpaRepository<Work,Integer> {
}
