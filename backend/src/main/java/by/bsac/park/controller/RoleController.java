package by.bsac.park.controller;

import by.bsac.park.entity.Role;
import by.bsac.park.services.implementation.RoleServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/role")
@CrossOrigin(origins = "http://localhost:4200")
public class RoleController {

    @Autowired
    private RoleServiceImpl roleService;
    @PostMapping
    public Role create(@RequestBody Role role){
        return roleService.create(role);

    }
    @GetMapping("/{id}")
    public Role findById(@PathVariable int id) {
        return roleService.findById(id);
    }
    @GetMapping("/find-all")
    public List<Role> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return roleService.findAll(pageNo,pageSize);
    }
    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        roleService.deleteByID(id);
    }
    @GetMapping("/size")
    public int getSize() {
        return roleService.getSize();
    }

}
