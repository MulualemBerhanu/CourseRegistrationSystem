package miu.edu.com.courseregistrationsystem.service;

import miu.edu.com.courseregistrationsystem.domain.AcademicBlock;

import java.util.Optional;


public interface AcademicBlockService {
    Optional<AcademicBlock> getBlockById(int courseOfferingId);
    void removeCourseOffering(int id);
}
