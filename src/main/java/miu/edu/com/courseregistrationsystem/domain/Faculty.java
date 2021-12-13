package miu.edu.com.courseregistrationsystem.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Faculty extends Person {

    @Id
    @GeneratedValue
    private int id;
    private int title;
}
