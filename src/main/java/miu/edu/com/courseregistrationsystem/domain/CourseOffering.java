package miu.edu.com.courseregistrationsystem.domain;

import lombok.Data;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class CourseOffering {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String role;
    private int availableSeat;

    @OneToMany
    private List<RegistrationRequest> registrationRequests = new ArrayList<>();

    @OneToOne
    private Course course;

    @OneToMany
    private List<Faculty> faculity = new ArrayList<>();


    public void addStudent(Student s) {
    }
}

