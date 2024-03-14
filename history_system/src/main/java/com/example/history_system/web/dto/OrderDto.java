package com.example.history_system.web.dto;

import lombok.Data;

@Data
public class OrderDto {
    private String product;
    private Integer amount;
    private String deliveryType;
    private String city;
}
