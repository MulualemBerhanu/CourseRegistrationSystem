package miu.edu.com.courseregistrationsystem.repository;

import miu.edu.com.studentregistrationsystem.domain.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
}
