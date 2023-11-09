package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Dependent {
    @Id
    int id;
    LocalDateTime birthday;
    String fullname;
    String relationship;
    @ManyToOne
    Employee employee;
}
