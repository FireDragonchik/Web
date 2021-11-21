package by.bsac.park.services.interfaces;

import by.bsac.park.entity.TypePlant;
import java.util.List;
public interface TypePlantService {
    TypePlant create (TypePlant type_plant);
    TypePlant findById(int id);
    List<TypePlant> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
}
