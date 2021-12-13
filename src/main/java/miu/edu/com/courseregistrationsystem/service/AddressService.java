package miu.edu.com.studentregistrationsystem.service;

import miu.edu.com.studentregistrationsystem.domain.Address;
import miu.edu.com.studentregistrationsystem.domain.CourseOffering;

import java.util.List;

public interface AddressService {
    void request(CourseOffering courseOffering, int studentId, int priority);
    void addAddress(Address address);
    void removeAddress(int id);

    Address getAddress(Integer id);
    Address save(Address address);
    List<Address> getAllAddress();
    void delete(Integer id);
}
