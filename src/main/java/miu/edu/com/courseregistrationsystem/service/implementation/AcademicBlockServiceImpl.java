package miu.edu.com.studentregistrationsystem.service.implementation;

import miu.edu.com.studentregistrationsystem.domain.AcademicBlock;
import miu.edu.com.studentregistrationsystem.domain.CourseOffering;
import miu.edu.com.studentregistrationsystem.repository.AcademicBlockRepository;
import miu.edu.com.studentregistrationsystem.service.AcademicBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicBlockServiceImpl implements AcademicBlockService {

    @Autowired
    AcademicBlockRepository academicBlockRepository;
    @Override
    public void request(CourseOffering courseOffering, int studentId, int priority) {

    }

    @Override
    public void addCourseOffering(CourseOffering courseOffering) {
        academicBlockRepository.save(new AcademicBlock());


    }

    @Override
    public void removeCourseOffering(int id) {

    }

    @Override
    public AcademicBlock getAcademicBlock(Integer id) {
        return academicBlockRepository.getById(id);
    }

    @Override
    public AcademicBlock save(AcademicBlock academicBlock) {
        return academicBlockRepository.save(academicBlock);
    }

    @Override
    public List<AcademicBlock> getAllAcademicBlock() {
        return academicBlockRepository.findAll();
    }

    @Override
    public void delete(Integer id) {

academicBlockRepository.delete(getAcademicBlock(id));
    }
}
