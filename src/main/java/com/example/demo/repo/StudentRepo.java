package com.example.demo.repo;

import com.example.demo.entity.Review;
import com.example.demo.entity.Student;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepo extends ListCrudRepository<Student,Integer> {
}
