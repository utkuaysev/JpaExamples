package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {

    @EmbeddedId
    private OrderId id;

    private int quantity;

    @MapsId("userId")
    @ManyToOne
    private User user;

    @MapsId("productId")
    @ManyToOne
    private Product product;



}
