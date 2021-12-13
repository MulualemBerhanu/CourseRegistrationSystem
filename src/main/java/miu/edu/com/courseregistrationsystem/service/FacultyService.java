package miu.edu.com.studentregistrationsystem.service;

import miu.edu.com.studentregistrationsystem.domain.Faculty;

import java.util.List;

public interface FacultyService {
    Faculty getFaculty(Integer id);
    Faculty save(Faculty faculty);
    List<Faculty> getAllFaculity();
    void delete(Integer id);
}
