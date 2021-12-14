package miu.edu.com.courseregistrationsystem.service.implementation;

import miu.edu.com.courseregistrationsystem.domain.Course;
import miu.edu.com.courseregistrationsystem.repository.CourseRepository;
import miu.edu.com.courseregistrationsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<Course> findAll() {
       return courseRepository.findAll();
    }

    @Override
    public Course findOne(Integer id) {
        return courseRepository.getById(id);
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void delete(Integer id) {
         courseRepository.deleteById(id);

    }
}
