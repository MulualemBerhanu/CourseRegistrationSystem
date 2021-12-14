package miu.edu.com.courseregistrationsystem.service.implementation;

import miu.edu.com.courseregistrationsystem.domain.Faculty;
import miu.edu.com.courseregistrationsystem.repository.FacultyRepository;
import miu.edu.com.courseregistrationsystem.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;
    @Override
    public Faculty findOne(Integer id) {
        return facultyRepository.getById(id);
    }

    @Override
    public Faculty save(Faculty faculty) {
        return null;
    }

    @Override
    public List<Faculty> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
