package com.example.demo.repo;

import com.example.demo.entity.Course;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CourseRepo extends ListCrudRepository<Course,Integer> {
}
