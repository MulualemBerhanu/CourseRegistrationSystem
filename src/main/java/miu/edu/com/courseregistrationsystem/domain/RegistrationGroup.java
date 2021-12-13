package miu.edu.com.courseregistrationsystem.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
@Data
public class RegistrationGroup {

    @Id
    @GeneratedValue
    private int id;

    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    @OneToMany
    private List<Student> student = new ArrayList<>();

    @OneToMany
    private List<AcademicBlock> blocks = new ArrayList<>();


    public void addStudent(Student Student) {}
    public void addBlock(AcademicBlock block) {}
    public void removeStudent(int groupId, int studentId){}
    public void removeBlock(int groupId, AcademicBlock block){}
}
