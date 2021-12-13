package miu.edu.com.studentregistrationsystem.service;

import miu.edu.com.studentregistrationsystem.domain.Course;

import java.util.List;

public interface CourseService {
    Course getCourse(Integer id);
    Course save(Course course);
    List<Course> getAllCourses();
    void delete(Integer id);


}
