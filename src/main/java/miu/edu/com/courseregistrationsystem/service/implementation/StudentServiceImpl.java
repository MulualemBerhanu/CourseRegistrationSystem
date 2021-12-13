package miu.edu.com.studentregistrationsystem.service.implementation;

import miu.edu.com.studentregistrationsystem.domain.Student;
import miu.edu.com.studentregistrationsystem.repository.StudentRepository;
import miu.edu.com.studentregistrationsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student getStudent(Integer id) {
        return studentRepository.getById(id);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);

    }
}
