package miu.edu.com.studentregistrationsystem.service.implementation;

import miu.edu.com.studentregistrationsystem.domain.RegistrationRequest;
import miu.edu.com.studentregistrationsystem.repository.RegistrationRequestRepository;
import miu.edu.com.studentregistrationsystem.service.RegistrationRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegistrationRequestServiceImpl implements RegistrationRequestService {
    @Autowired
    RegistrationRequestRepository registrationRequestRepository;

    @Override
    public RegistrationRequest getRegistrationRequest(Integer id) {
        return registrationRequestRepository.getById(id);
    }

    @Override
    public RegistrationRequest save(RegistrationRequest registrationRequest) {
        return registrationRequestRepository.save(registrationRequest);
    }

    @Override
    public List<RegistrationRequest> getAllRegistrationRequest() {
        return registrationRequestRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        registrationRequestRepository.deleteById(id);

    }
}
