package by.bsac.park.services.implementation;

import by.bsac.park.entity.Forest;
import by.bsac.park.repository.ForestRepo;
import by.bsac.park.services.interfaces.ForestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ForestServiceImpl implements ForestService {
   @Autowired
   private ForestRepo forestRepo;

    @Override
    public Forest create(Forest forest) {
        return forestRepo.save( forest);
    }
    @Override
    public Forest findById(int id) {
        return forestRepo.findById(id).get();
    }
    @Override
    public List<Forest> findAll(int page, int size) {
        return forestRepo.findAll(PageRequest.of(page,size)).getContent();
    }
    @Override
    public void deleteByID(int id) {
        forestRepo.deleteById(id);
    }
    @Override
    public int getSize() {
        return (int) forestRepo.count();
    }
}
