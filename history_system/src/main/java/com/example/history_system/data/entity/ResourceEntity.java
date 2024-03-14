package com.example.history_system.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ResourceEntity {
    @Id
    private Long id;
    private String resourceType;
    private Long amount;
}
