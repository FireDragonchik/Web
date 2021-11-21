package by.bsac.park.services.interfaces;

import by.bsac.park.entity.Role;
import java.util.List;
public interface RoleService {

    Role create (Role role);
    Role findById(int id);
    List<Role> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
}
