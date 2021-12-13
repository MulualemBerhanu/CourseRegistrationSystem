package miu.edu.com.studentregistrationsystem.service;

import miu.edu.com.studentregistrationsystem.domain.RegistrationRequest;

import java.util.List;

public interface RegistrationRequestService {
    RegistrationRequest getRegistrationRequest(Integer id);
    RegistrationRequest save(RegistrationRequest registrationRequest);
    List<RegistrationRequest> getAllRegistrationRequest();
    void delete(Integer id);
}
