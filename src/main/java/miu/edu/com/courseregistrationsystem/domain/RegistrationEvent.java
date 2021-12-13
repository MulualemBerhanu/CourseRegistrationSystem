package miu.edu.com.courseregistrationsystem.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class RegistrationEvent {

    @Id
    @GeneratedValue
    private int id;
    @OneToMany
    private List<RegistrationGroup> group = new ArrayList<>();



    public void addRegistrationGroup(int RegistrationGroup) {

    }

}
