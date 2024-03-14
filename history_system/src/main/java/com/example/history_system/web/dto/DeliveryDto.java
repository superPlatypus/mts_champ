package com.example.history_system.web.dto;

import lombok.Data;

import java.util.List;

@Data
public class DeliveryDto {
    private String city;
    private String courierType;
    private List<Long> orders;
    private String status;
}
