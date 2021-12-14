package miu.edu.com.courseregistrationsystem.domain;

import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;

    @Embedded
    private Address mallingAddress;
    @Embedded
    private Address homeAddress;


    public void addStudent(Student Student) {}

    public Integer getId() {
        return getId();
    }
}
