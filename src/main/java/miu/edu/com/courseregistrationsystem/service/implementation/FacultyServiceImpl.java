package miu.edu.com.studentregistrationsystem.service.implementation;

import miu.edu.com.studentregistrationsystem.domain.Faculty;
import miu.edu.com.studentregistrationsystem.repository.FacultyRepository;
import miu.edu.com.studentregistrationsystem.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacultyServiceImpl implements FacultyService {
    @Autowired
    FacultyRepository facultyRepository;
    @Override
    public Faculty getFaculty(Integer id) {
        return facultyRepository.getById(id);
    }

    @Override
    public Faculty save(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public List<Faculty> getAllFaculity() {
        return facultyRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        facultyRepository.deleteById(id);

    }
}
