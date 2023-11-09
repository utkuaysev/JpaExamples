package com.example.demo.repo;

import com.example.demo.entity.Review;
import com.example.demo.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepo extends ListCrudRepository<User,Integer> {
}
