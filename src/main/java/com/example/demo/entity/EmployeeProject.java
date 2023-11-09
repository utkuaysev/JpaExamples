package com.example.demo.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmployeeProject {
    @EmbeddedId
    EmployeeProjectEmbeddable id;
    @ManyToOne
    @MapsId("employeeId")
    Employee employee;
    @ManyToOne
    @MapsId("projectId")
    Project project;
    int hours;
}
