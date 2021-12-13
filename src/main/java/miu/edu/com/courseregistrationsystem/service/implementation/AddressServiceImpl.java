package miu.edu.com.studentregistrationsystem.service.implementation;

import miu.edu.com.studentregistrationsystem.domain.Address;
import miu.edu.com.studentregistrationsystem.domain.CourseOffering;
import miu.edu.com.studentregistrationsystem.repository.AdressRepository;
import miu.edu.com.studentregistrationsystem.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AdressRepository adressRepository;
    @Override
    public void request(CourseOffering courseOffering, int studentId, int priority) {


    }

    @Override
    public void addAddress(Address address) {

    }

    @Override
    public void removeAddress(int id) {

    }

    @Override
    public Address getAddress(Integer id) {
        return adressRepository.getById(id);
    }

    @Override
    public Address save(Address address) {
        return adressRepository.save(address);
    }

    @Override
    public List<Address> getAllAddress() {
        return adressRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        adressRepository.deleteById(id);

    }
}
