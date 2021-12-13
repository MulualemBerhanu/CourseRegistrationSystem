package miu.edu.com.courseregistrationsystem.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Registration {
    @Id
    @GeneratedValue
    private int id;

    @OneToOne
    private Student student;

    @OneToOne
    private CourseOffering courseOffering;
}
