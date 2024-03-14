package com.example.history_system.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderEntity {
    @Id
    private Long id;
    private String product;
    private Integer amount;
    private String deliveryType;
    private String city;
}
