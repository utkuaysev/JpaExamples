package com.example.demo.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Department {
    @EmbeddedId
    DepartmentId id;
    String phone;
    @OneToOne
    @JoinColumn(name = "manager_id")
    Employee manager;

}
