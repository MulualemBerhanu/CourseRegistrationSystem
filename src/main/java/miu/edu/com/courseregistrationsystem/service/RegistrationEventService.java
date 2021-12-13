package miu.edu.com.studentregistrationsystem.service;

import miu.edu.com.studentregistrationsystem.domain.RegistrationEvent;

import java.util.List;

public interface RegistrationEventService {
    RegistrationEvent getRegistrationEvent(Integer id);
    RegistrationEvent save(RegistrationEvent registrationEvent);
    List<RegistrationEvent> getAllRegistrationEvent();
    void delete(Integer id);
}
