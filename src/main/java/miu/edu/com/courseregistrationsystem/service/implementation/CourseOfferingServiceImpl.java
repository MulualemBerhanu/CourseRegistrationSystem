package miu.edu.com.studentregistrationsystem.service.implementation;

import miu.edu.com.studentregistrationsystem.domain.CourseOffering;
import miu.edu.com.studentregistrationsystem.domain.Student;
import miu.edu.com.studentregistrationsystem.repository.CourseOfferingRepository;
import miu.edu.com.studentregistrationsystem.service.CourseOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseOfferingServiceImpl implements CourseOfferingService {
    @Autowired
    CourseOfferingRepository courseOfferingRepository;
    @Override
    public void request(Student student, int priority) {


    }

    @Override
    public void update(CourseOffering courseOffering) {

    }

    @Override
    public CourseOffering getCourseOffering(Integer id) {
        return courseOfferingRepository.getById(id);
    }

    @Override
    public CourseOffering save(CourseOffering courseOffering) {
        return courseOfferingRepository.save(courseOffering);
    }

    @Override
    public List<CourseOffering> getAllCourseOffering() {
        return courseOfferingRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        courseOfferingRepository.deleteById(id);

    }
}
