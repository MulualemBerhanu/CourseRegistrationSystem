package miu.edu.com.studentregistrationsystem.service;

import miu.edu.com.studentregistrationsystem.domain.AcademicBlock;
import miu.edu.com.studentregistrationsystem.domain.CourseOffering;

import java.util.List;

public interface AcademicBlockService {
    void request(CourseOffering courseOffering, int studentId, int priority);
    void addCourseOffering(CourseOffering courseOffering);
    void removeCourseOffering(int id);
    AcademicBlock getAcademicBlock(Integer id);
    AcademicBlock save(AcademicBlock academicBlock);
    List<AcademicBlock> getAllAcademicBlock();
    void delete(Integer id);
}
