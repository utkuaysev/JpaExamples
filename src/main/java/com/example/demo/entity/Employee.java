package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    int id;
    String name;
    String gender;
    String ssn;
    @OneToOne
    Department worksIn;
    @OneToMany(mappedBy = "employee")
    List<EmployeeProject> employeeProjects;
    @OneToMany(mappedBy = "employee")
    List<Dependent> dependents;
}
