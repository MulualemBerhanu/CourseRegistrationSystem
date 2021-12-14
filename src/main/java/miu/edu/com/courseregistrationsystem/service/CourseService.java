package miu.edu.com.courseregistrationsystem.service;

import miu.edu.com.courseregistrationsystem.domain.Course;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CourseService {
    public List<Course> findAll();

    @GetMapping("/{id}")
    public Course findOne(Integer id);

    @PostMapping("/add")
    public Course save(@RequestBody Course course);

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id);
}
