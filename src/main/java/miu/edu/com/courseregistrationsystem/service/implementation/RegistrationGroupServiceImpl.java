package miu.edu.com.studentregistrationsystem.service.implementation;

import miu.edu.com.studentregistrationsystem.domain.AcademicBlock;
import miu.edu.com.studentregistrationsystem.domain.RegistrationGroup;
import miu.edu.com.studentregistrationsystem.domain.Student;
import miu.edu.com.studentregistrationsystem.repository.RegistrationGroupRepository;
import miu.edu.com.studentregistrationsystem.service.RegistrationGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationGroupServiceImpl implements RegistrationGroupService {
    @Autowired
    private RegistrationGroupRepository registrationGroupRepository;

    @Autowired

    public RegistrationGroupServiceImpl(RegistrationGroupRepository registrationGroupRepository) {
        this.registrationGroupRepository = registrationGroupRepository;
    }

    @Override
    public void request(int groupId,int studentId, int blockId, int courseOfferingId, int priority) {
        Optional<RegistrationGroup> registrationGroup = registrationGroupRepository.findById(groupId);
        registrationGroup.ifPresentOrElse(r->{
            r.request(blockId,courseOfferingId,studentId,priority);
        },() -> {
            throw new IllegalArgumentException("group does not exist");
        });
    }

    @Override
    public void addStudent(int groupId, Student student) {

    }

    @Override
    public void addBlock(int groupId, AcademicBlock block) {

    }

    @Override
    public void removeStudent(int groupId, int studentId) {

    }

    @Override
    public void removeBlock(int groupId, AcademicBlock block) {

    }

    @Override
    public RegistrationGroup getRegistrationGroup(Integer id) {
        return registrationGroupRepository.getById(id) ;
    }

    @Override
    public RegistrationGroup save(RegistrationGroup registrationGroup) {
        return registrationGroupRepository.save(registrationGroup);
    }

    @Override
    public List<RegistrationGroup> getAllRegistrationGroup() {
        return registrationGroupRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        registrationGroupRepository.deleteById(id);


    }


}
