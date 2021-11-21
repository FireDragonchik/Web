package by.bsac.park.controller;


import by.bsac.park.entity.Plant;
import by.bsac.park.services.implementation.PlantServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/plant")
@CrossOrigin(origins = "http://localhost:4200")
public class PlantController {
    @Autowired
    private PlantServiceImpl plantService;
    @PostMapping
    public Plant create(@RequestBody Plant plant){
        return plantService.create(plant);
    }
    @GetMapping("/{id}")
    public Plant findById(@PathVariable int id) {
        return plantService.findById(id);
    }
    @GetMapping("/find-all")
    public List<Plant> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return plantService.findAll(pageNo,pageSize);
    }
    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        plantService.deleteByID(id);
    }
    @GetMapping("/size")
    public int getSize() {
        return plantService.getSize();
    }
}
