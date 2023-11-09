package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DepartmentId implements Serializable {
    @Column(name = "number")
    private double number;
    @Column(name = "name")
    private String name;
}
