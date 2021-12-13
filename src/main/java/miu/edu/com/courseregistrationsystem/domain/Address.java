package miu.edu.com.courseregistrationsystem.domain;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
public class Address {

    @Id
    @GeneratedValue
    private int id;
    private int street;
    private int city;
    private int postalCode;
    private int state;
}
