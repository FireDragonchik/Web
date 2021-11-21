package by.bsac.park.services.implementation;

import by.bsac.park.entity.Plant;
import by.bsac.park.repository.PlantRepo;
import by.bsac.park.services.interfaces.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantServiceImpl implements PlantService{
@Autowired
    private PlantRepo plantRepo;

    @Override
    public Plant create(Plant plant) {
        return plantRepo.save(plant);
    }
    @Override
    public Plant findById(int id) {
        return plantRepo.findById(id).get();
    }

    @Override
    public List<Plant> findAll(int page, int size) {
        return plantRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        plantRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) plantRepo.count();
    }



}
