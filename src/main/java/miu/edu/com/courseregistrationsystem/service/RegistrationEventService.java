package miu.edu.com.courseregistrationsystem.service;

import miu.edu.com.courseregistrationsystem.domain.RegistrationEvent;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface RegistrationEventService {
    public RegistrationEvent findOne(Integer id);

    public RegistrationEvent save(RegistrationEvent registrationEvent);

    public List<RegistrationEvent> findAll();

    public void delete(Integer id);
}
