package miu.edu.com.studentregistrationsystem.service;

import miu.edu.com.studentregistrationsystem.domain.Registration;

import java.util.List;

public interface RegistrationService {
    Registration getRegistration(Integer id);
    Registration save(Registration registration);
    List<Registration> getAllRegistrationService();
    void delete(Integer id);
}
