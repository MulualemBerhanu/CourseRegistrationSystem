package miu.edu.com.courseregistrationsystem.service.implementation;

import miu.edu.com.courseregistrationsystem.domain.CourseOffering;
import miu.edu.com.courseregistrationsystem.domain.Student;
import miu.edu.com.courseregistrationsystem.repository.CourseOfferingRepository;
import miu.edu.com.courseregistrationsystem.service.CourseOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseOfferingServiceImpl implements CourseOfferingService {

    @Autowired
    private CourseOfferingRepository courseOfferingRepository;
    @Override
    public CourseOffering update(Integer id, CourseOffering courseOffering) {
        return courseOfferingRepository.save(courseOffering);
    }

    @Override
    public CourseOffering findOne(Integer id) {
        return courseOfferingRepository.getById(id);
    }

    @Override
    public CourseOffering save(CourseOffering courseOffering) {
        return courseOfferingRepository.save(courseOffering);
    }

    @Override
    public List<CourseOffering> findAll() {
        return courseOfferingRepository.findAll();
    }

    @Override
    public void delete(Integer id) {

    }
}
