package by.bsac.park.controller;

import by.bsac.park.entity.Work;
import by.bsac.park.services.implementation.WorkServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/work")
@CrossOrigin(origins = "http://localhost:4200")
public class WorkController {
    @Autowired
    private WorkServiceImpl workService;
    @PostMapping
    public Work create(@RequestBody Work work){
        return workService.create(work);

    }
    @GetMapping("/{id}")
    public Work findById(@PathVariable int id) {
        return workService.findById(id);
    }
    @GetMapping("/find-all")
    public List<Work> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return workService.findAll(pageNo,pageSize);
    }
    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        workService.deleteByID(id);
    }
    @GetMapping("/size")
    public int getSize() {
        return workService.getSize();
    }

}
