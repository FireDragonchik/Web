package by.bsac.park.services.implementation;

import by.bsac.park.entity.TypePlant;
import by.bsac.park.repository.TypePlantRepo;
import by.bsac.park.services.interfaces.TypePlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePlantServiceImpl implements TypePlantService {
    @Autowired
    private TypePlantRepo typePlantRepo;
    @Override
    public TypePlant create(TypePlant typePlant) {
        return typePlantRepo.save(typePlant);
    }
    @Override
    public TypePlant findById(int id) {
        return typePlantRepo.findById(id).get();
    }
    @Override
    public List<TypePlant> findAll(int page, int size) {
        return typePlantRepo.findAll(PageRequest.of(page,size)).getContent();
    }
    @Override
    public void deleteByID(int id) {
        typePlantRepo.deleteById(id);
    }
    @Override
    public int getSize() {
        return (int) typePlantRepo.count();
    }

}
