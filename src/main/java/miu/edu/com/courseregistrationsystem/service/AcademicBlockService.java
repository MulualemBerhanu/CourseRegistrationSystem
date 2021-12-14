package miu.edu.com.courseregistrationsystem.service;

import miu.edu.com.courseregistrationsystem.domain.AcademicBlock;
import miu.edu.com.courseregistrationsystem.domain.CourseOffering;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


public interface AcademicBlockService {

    public List<AcademicBlock> findAll();


    public AcademicBlock findOne( Integer id);


    public AcademicBlock save(AcademicBlock academicBlock);


    public void delete(Integer id);
    public void removeCourseOffering(@PathVariable Integer id);
    public void addCourseOffering(CourseOffering courseOffering);
}
