package by.bsac.park.repository;

import by.bsac.park.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    User findUserByLogin (String login);
    User findUserByLoginAndPassword(String login,String password);
}
