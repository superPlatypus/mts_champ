package com.example.history_system.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DeliveryEntity {
    @Id
    private Long id;
    private String city;
    private String courierType;
    private String status;
}
