package miu.edu.com.courseregistrationsystem.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue
    private int id;
    private int name;
    private String courseCode;
    private int description;
}
