package by.bsac.park.controller;

import by.bsac.park.entity.User;
import by.bsac.park.services.implementation.UserServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);

    }
    @GetMapping("/{id}")
    public User findById(@PathVariable int id) {
        return userService.findById(id);
    }
    @GetMapping("/find-all")
    public List<User> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return userService.findAll(pageNo,pageSize);
    }
    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        userService.deleteByID(id);
    }
    @GetMapping("/size")
    public int getSize() {
        return userService.getSize();
    }
    @GetMapping("/find-by-login-and-password")
    public User findUserByLoginAndPassword(@RequestParam String login,@RequestParam String password) {
        return userService.findUserByLoginAndPassword(login,password);
    }
    @GetMapping("/find-by-login")
    public User findUserByLogin(@PathVariable String login) {
        return userService.findUserByLogin(login);
    }
}
