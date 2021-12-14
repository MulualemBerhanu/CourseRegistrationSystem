package miu.edu.com.courseregistrationsystem.service;

import miu.edu.com.courseregistrationsystem.domain.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface StudentService {
    public Student findOne(Integer id);

    public Student save(Student student);

    public List<Student> findAll();

    public void delete(Integer id);

}
