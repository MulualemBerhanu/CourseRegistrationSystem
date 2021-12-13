package miu.edu.com.studentregistrationsystem.service.implementation;

import miu.edu.com.studentregistrationsystem.domain.Registration;
import miu.edu.com.studentregistrationsystem.repository.RegistrationRepository;
import miu.edu.com.studentregistrationsystem.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    RegistrationRepository registrationRepository;

    @Override
    public Registration getRegistration(Integer id) {
        return registrationRepository.getById(id);
    }

    @Override
    public Registration save(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public List<Registration> getAllRegistrationService() {
        return registrationRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        registrationRepository.deleteById(id);

    }
}
