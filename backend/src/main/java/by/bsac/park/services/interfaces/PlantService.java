package by.bsac.park.services.interfaces;

import by.bsac.park.entity.Plant;
import java.util.List;

public interface PlantService {
    Plant create (Plant plant);
    Plant findById(int id);
    List<Plant> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();


}
