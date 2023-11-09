package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Project {
    @Id
    int id;
    String name;
    int number;
    String location;
    @OneToMany(mappedBy = "project")
    List<EmployeeProject> employeeProjectList;
}
