package miu.edu.com.courseregistrationsystem.controller;

import miu.edu.com.courseregistrationsystem.domain.Faculty;
import miu.edu.com.courseregistrationsystem.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Faculty")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @GetMapping(value = "/get/{id}")
    public Faculty findOne(@PathVariable Integer id) {
       return facultyService.findOne(id);
    }

    @PostMapping(value = "/save")
    public Faculty save(@RequestBody Faculty faculty) {
        return facultyService.save(faculty);
    }

    @GetMapping(value = "/get/all")
    public List<Faculty> findAll() {
        return facultyService.findAll();
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        facultyService.delete(id);
    }

}
