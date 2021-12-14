package miu.edu.com.courseregistrationsystem.service;

import miu.edu.com.courseregistrationsystem.domain.Faculty;
import miu.edu.com.courseregistrationsystem.repository.FacultyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface FacultyService {



    public Faculty findOne(Integer id);


    public Faculty save(Faculty faculty);


    public List<Faculty> findAll();


    public void delete(Integer id);
}
