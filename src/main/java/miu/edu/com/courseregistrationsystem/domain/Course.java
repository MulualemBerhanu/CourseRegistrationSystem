package miu.edu.com.courseregistrationsystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private int id;
    private int name;
    private int description;
}
