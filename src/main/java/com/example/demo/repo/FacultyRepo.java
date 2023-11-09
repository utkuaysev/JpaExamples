package com.example.demo.repo;

import com.example.demo.entity.Faculty;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FacultyRepo extends ListCrudRepository<Faculty,Integer> {
}
