package com.example.issatc.Infrastructure.EntityMappers;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Entity(name = "teacher")
@Inheritance(strategy = InheritanceType.JOINED)

public class TeacherMapper extends UserMapper {
    @Column(unique = true)
    long cin;

    public TeacherMapper() {
    }

    public TeacherMapper(String email, String firstName, String lastName, String password, Role role, long phoneNumb, long cin) {
        super(email, firstName, lastName, password, role, phoneNumb);
        this.cin = cin;
    }
    public TeacherMapper(String email, String firstName, String lastName,  Role role, long cin) {
        super(email, firstName, lastName,  role);
        this.cin = cin;
    }

}
