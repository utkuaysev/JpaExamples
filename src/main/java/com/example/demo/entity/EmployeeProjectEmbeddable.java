package com.example.demo.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EmployeeProjectEmbeddable implements Serializable {
int employeeId;
int projectId;
}
