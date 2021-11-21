package by.bsac.park.controller;

import by.bsac.park.entity.TypePlant;
import by.bsac.park.services.implementation.TypePlantServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/type_plant")
@CrossOrigin(origins = "http://localhost:4200")
public class TypePlantController {
    @Autowired
    private TypePlantServiceImpl typePlantService;

    @PostMapping
    public TypePlant create(@RequestBody TypePlant typePlant){
        return typePlantService.create(typePlant);

    }
    @GetMapping("/{id}")
    public TypePlant findById(@PathVariable int id) {
        return typePlantService.findById(id);
    }
    @GetMapping("/find-all")
    public List<TypePlant> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return typePlantService.findAll(pageNo,pageSize);
    }
    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        typePlantService.deleteByID(id);
    }
    @GetMapping("/size")
    public int getSize() {
        return typePlantService.getSize();
    }
}
