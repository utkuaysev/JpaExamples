package com.example.demo.repo;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo  extends ListCrudRepository<Product,Integer> {

    @Override
//    @EntityGraph(value = "productWithReviews", type = EntityGraph.EntityGraphType.LOAD)
    Optional<Product> findById(Integer id);

    @Override
//    @EntityGraph(value = "productWithReviews", type = EntityGraph.EntityGraphType.LOAD)
    List<Product> findAll();

}
