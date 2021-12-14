package miu.edu.com.courseregistrationsystem.repository;

import miu.edu.com.courseregistrationsystem.domain.RegistrationGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationGroupRepository extends JpaRepository<RegistrationGroup, Integer> {
}
