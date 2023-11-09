package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CourseId implements Serializable {
    private int code;
    @Column(name = "code_name")
    private String codeName;

}
