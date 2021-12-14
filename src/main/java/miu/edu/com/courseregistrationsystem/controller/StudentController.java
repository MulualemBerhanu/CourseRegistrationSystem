package miu.edu.com.courseregistrationsystem.controller;


import miu.edu.com.courseregistrationsystem.domain.Student;
import miu.edu.com.courseregistrationsystem.service.implementation.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping(value = "/get/{id}")
    public Student getStudent(@PathVariable Integer id) {
        return studentService.findOne(id);
    }

    @PostMapping(value = "/save")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping(value = "/all")
    public List<Student> getAllStudent() {
        return studentService.findAll();
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        studentService.delete(id);

    }
}
