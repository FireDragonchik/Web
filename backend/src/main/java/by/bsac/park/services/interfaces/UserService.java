package by.bsac.park.services.interfaces;


import by.bsac.park.entity.User;
import java.util.List;
public interface UserService {
    User create (User user);
    User findById(int id);
    List<User> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
    User findUserByLogin (String login);
    User findUserByLoginAndPassword(String login,String password);

}
