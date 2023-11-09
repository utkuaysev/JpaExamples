package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.time.LocalDateTime;
import java.util.List;

//@NamedEntityGraph(
//        name = "productWithReviews",
//        attributeNodes = {
//                @NamedAttributeNode(value = "reviews")
//        }
//)
@Entity
@Getter
@Setter
public class Product {

    @Id
    private int id;

    private String name;

    private int price;
    private String category;
    private String color;

    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "product_id")
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Review> reviews;

    @OneToMany(mappedBy = "product")
    private List<Order> orders;

}
