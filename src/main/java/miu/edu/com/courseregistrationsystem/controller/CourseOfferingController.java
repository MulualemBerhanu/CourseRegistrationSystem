package miu.edu.com.courseregistrationsystem.controller;

import miu.edu.com.courseregistrationsystem.domain.CourseOffering;
import miu.edu.com.courseregistrationsystem.service.CourseOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courseoffering")
public class CourseOfferingController {

    @Autowired
    private CourseOfferingService courseOfferingService;


    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody CourseOffering courseOffering) {
     if(id.equals(courseOffering.getId())){
         return ResponseEntity.ok(courseOfferingService.save(courseOffering));
     } else{
         return ResponseEntity.badRequest().build();
     }
    }

    @GetMapping(value = "/get/{id}")
    public CourseOffering findOne(@PathVariable Integer id) {

        return courseOfferingService.findOne(id);
    }

    @GetMapping(value = "/save")
    public CourseOffering save(@RequestBody CourseOffering courseOffering) {
        return courseOfferingService.save(courseOffering);
    }

    @GetMapping("/all")
    public List<CourseOffering> findAll() {
        return courseOfferingService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        courseOfferingService.delete(id);
    }
}
