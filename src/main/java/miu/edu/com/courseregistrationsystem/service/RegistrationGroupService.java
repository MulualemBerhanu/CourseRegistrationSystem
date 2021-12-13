package miu.edu.com.studentregistrationsystem.service;

import miu.edu.com.studentregistrationsystem.domain.AcademicBlock;
import miu.edu.com.studentregistrationsystem.domain.RegistrationGroup;
import miu.edu.com.studentregistrationsystem.domain.Student;

import java.util.List;

public interface RegistrationGroupService {
    void request(int groupId,int studentId,int blockId, int courseOfferingId, int priority);
    void addStudent(int groupId, Student student);
    void addBlock(int groupId, AcademicBlock block);
    void removeStudent(int groupId, int studentId);
    void removeBlock(int groupId, AcademicBlock block);
    RegistrationGroup getRegistrationGroup(Integer id);
    RegistrationGroup save(RegistrationGroup registrationGroup);
    List<RegistrationGroup> getAllRegistrationGroup();
    void delete(Integer id);

}
