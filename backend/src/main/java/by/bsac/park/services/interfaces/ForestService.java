package by.bsac.park.services.interfaces;

import by.bsac.park.entity.Forest;

import java.util.List;

public interface ForestService {
   Forest create(Forest forest);
    Forest findById(int id);
    List<Forest> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
}
