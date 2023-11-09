package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Course {

    @EmbeddedId
    private CourseId id;

    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "code", referencedColumnName = "code"),
            @JoinColumn(name = "code_name", referencedColumnName = "code_name")
    })
    List<Student> students;

}
