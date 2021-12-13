package miu.edu.com.courseregistrationsystem.domain;

import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    private int id;

    @Embedded
    private Address mallingAddress;
    @Embedded
    private Address homeAddress;
}
