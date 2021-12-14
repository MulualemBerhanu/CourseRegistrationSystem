package miu.edu.com.courseregistrationsystem.controller;

import miu.edu.com.courseregistrationsystem.domain.RegistrationEvent;
import miu.edu.com.courseregistrationsystem.service.RegistrationEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/registrationEvents")
public class RegistrationEventController {

    @Autowired
    private RegistrationEventService registrationEventService;


    @GetMapping(value = "/get/{id}")
    public RegistrationEvent findOne(@PathVariable Integer id) {
        return registrationEventService.findOne(id);
    }

    @PostMapping(value = "/save")
    public RegistrationEvent save(@RequestBody RegistrationEvent registrationEvent) {
        return registrationEventService.save(registrationEvent);
    }

    @GetMapping(value = "/all")
    public List<RegistrationEvent> findAll() {
        return registrationEventService.findAll();
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        registrationEventService.delete(id);
    }
}
