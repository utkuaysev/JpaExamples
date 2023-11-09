package com.example.demo.repo;

import com.example.demo.entity.Order;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends ListCrudRepository<Order,Integer> {
}
