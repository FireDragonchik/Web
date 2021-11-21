package by.bsac.park.controller;

import by.bsac.park.entity.Forest;
import by.bsac.park.services.implementation.ForestServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/forest")
@CrossOrigin(origins = "http://localhost:4200")
public class ForestController {

    @Autowired
    private ForestServiceImpl forestService;

    @PostMapping
    public Forest create(@RequestBody Forest forest){
        return forestService.create(forest);
    }
    @GetMapping("/{id}")
    public Forest findById(@PathVariable int id) {
        return forestService.findById(id);
    }
    @GetMapping("/find-all")
    public List<Forest> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return forestService.findAll(pageNo,pageSize);
    }
    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        forestService.deleteByID(id);
    }
    @GetMapping("/size")
    public int getSize() {
        return forestService.getSize();
    }
}
