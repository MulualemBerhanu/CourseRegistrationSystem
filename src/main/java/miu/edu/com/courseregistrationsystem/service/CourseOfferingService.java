package miu.edu.com.studentregistrationsystem.service;

import miu.edu.com.studentregistrationsystem.domain.CourseOffering;
import miu.edu.com.studentregistrationsystem.domain.Student;

import java.util.List;

public interface CourseOfferingService {
    void request(Student student, int priority);
    void update(CourseOffering courseOffering);
    CourseOffering getCourseOffering(Integer id);
    CourseOffering save(CourseOffering courseOffering);
    List<CourseOffering> getAllCourseOffering();
    void delete(Integer id);
}
