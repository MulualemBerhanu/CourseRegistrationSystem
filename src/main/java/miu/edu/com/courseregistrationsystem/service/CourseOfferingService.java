package miu.edu.com.courseregistrationsystem.service;

import miu.edu.com.courseregistrationsystem.domain.CourseOffering;
import miu.edu.com.courseregistrationsystem.domain.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CourseOfferingService {
    public CourseOffering update(Integer id, CourseOffering courseOffering);



    public CourseOffering findOne(Integer id);


    public CourseOffering save(CourseOffering courseOffering);

    public List<CourseOffering> findAll();


    public void delete(@PathVariable Integer id);
}
