package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Embeddable
public class OrderId implements Serializable {

    private int userId;
    private int productId;
    private LocalDateTime orderDateTime;

}
