package com.example.delivery.controller;

import com.example.delivery.models.Order;
import com.example.delivery.service.DeliveryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    @Autowired
    DeliveryServiceImpl deliveryService;

    @RequestMapping("/order")
    public void postOrder(@RequestBody Order order) throws InterruptedException {
        deliveryService.createDelivery(order);
    }
}
