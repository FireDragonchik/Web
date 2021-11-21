package by.bsac.park.services.interfaces;

import by.bsac.park.entity.Work;

import java.util.List;
public interface WorkService {
    Work create (Work work);
    Work findById(int id);
    List<Work> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
}
