package miu.edu.com.courseregistrationsystem.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class RegistrationRequest {

    @Id
    @GeneratedValue
    private int id;
    private int priority;

    @ManyToOne
    private Student student;

    @ManyToOne
    private CourseOffering courseOffering;

}
