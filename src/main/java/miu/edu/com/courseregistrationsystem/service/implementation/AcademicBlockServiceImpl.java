package miu.edu.com.courseregistrationsystem.service.implementation;

import miu.edu.com.courseregistrationsystem.domain.AcademicBlock;

import miu.edu.com.courseregistrationsystem.domain.CourseOffering;
import miu.edu.com.courseregistrationsystem.repository.AcademicBlockRepository;
import miu.edu.com.courseregistrationsystem.service.AcademicBlockService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AcademicBlockServiceImpl implements AcademicBlockService {
    @Autowired
    private AcademicBlockRepository academicBlockRepository;





    @Override
    public List<AcademicBlock> findAll() {
        return academicBlockRepository.findAll();
    }



    @Override
    public AcademicBlock findOne(Integer id) {
        return academicBlockRepository.getById(id);
    }

    @Override
    public AcademicBlock save(AcademicBlock academicBlock) {
        return academicBlockRepository.save(academicBlock);
    }

    @Override
    public void delete(Integer id) {
        academicBlockRepository.deleteById(id);

    }

    @Override
    public void removeCourseOffering(Integer id) {
        academicBlockRepository.deleteById(id);
    }

    @Override
    public void addCourseOffering(CourseOffering courseOffering) {
        academicBlockRepository.addCourseOffering(courseOffering);

    }
}
