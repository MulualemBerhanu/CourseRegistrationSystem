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

    @OneToOne
    private Course course;

    @OneToOne
    private Faculty faculity;

    @OneToOne
    private AcademicBlock block;

    @ManyToMany
    @JoinTable(name = "Offer_Student")
    private List<Student> registrationRequest = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "Offer_Student")
    private List<Student> registration = new ArrayList<>();
    private int availableSeat;


    public void request( Student student, int priority) {
        // TODO - implement CourseOffering.request
        throw new UnsupportedOperationException();
    }
    public void addStudent(Student student){
        registrationRequest.add(student);
    }
}
