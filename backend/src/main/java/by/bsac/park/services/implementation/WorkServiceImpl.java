package by.bsac.park.services.implementation;

import by.bsac.park.entity.Work;
import by.bsac.park.repository.WorkRepo;
import by.bsac.park.services.interfaces.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkRepo workRepo;
    @Override
    public Work create(Work work) {
        return workRepo.save(work);
    }
    @Override
    public Work findById(int id) {
        return workRepo.findById(id).get();
    }
@Override
public List<Work> findAll(int page, int size) {
    return workRepo.findAll(PageRequest.of(page,size)).getContent();
}
@Override
public void deleteByID(int id) {
   workRepo.deleteById(id);
}
@Override
public int getSize() {
    return (int) workRepo.count();
}
}
