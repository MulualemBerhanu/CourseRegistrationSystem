package miu.edu.com.courseregistrationsystem.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

    @Id
    @GeneratedValue
    private int id;
    private int firstName;
    private int lastName;
    private int email;
}
