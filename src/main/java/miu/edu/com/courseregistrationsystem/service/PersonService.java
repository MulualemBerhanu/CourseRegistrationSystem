package miu.edu.com.studentregistrationsystem.service;

import miu.edu.com.studentregistrationsystem.domain.Person;

import java.util.List;

public interface PersonService {
    Person getPerson(Integer id);
    Person save(Person person);
    List<Person> getAllPerson();
    void delete(Integer id);
}
