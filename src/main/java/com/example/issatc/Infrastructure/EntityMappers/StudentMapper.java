package com.example.issatc.Infrastructure.EntityMappers;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity(name = "student")
@Data
public class StudentMapper extends  UserMapper  {

    public StudentMapper() {
    }

    @Column(unique = true)
    long numInscription;

    public StudentMapper(String email, String firstName, String lastName, String password, Role role, long phoneNumb, long numInscription) {
        super(email, firstName, lastName, password, role, phoneNumb);
        this.numInscription = numInscription;
    }

    public StudentMapper(String email, String firstName, String lastName, Role role, long numInscription) {
        super(email, firstName, lastName,  role );
        this.numInscription = numInscription;
    }



}
