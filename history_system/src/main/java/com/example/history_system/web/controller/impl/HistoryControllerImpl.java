package com.example.history_system.web.controller.impl;

import com.example.history_system.web.controller.HistoryController;
import com.example.history_system.web.dto.DeliveryDto;
import com.example.history_system.web.dto.OrderDto;
import com.example.history_system.web.dto.ResourceDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/history-api/v1")
public class HistoryControllerImpl implements HistoryController {
    @PostMapping("/resource")
    @Override
    public void postResource(@RequestBody ResourceDto dto) {

    }

    @PostMapping("/order")
    @Override
    public void postOrder(@RequestBody OrderDto dto) {

    }

    @PostMapping("/delivery")
    @Override
    public void postDelivery(@RequestBody DeliveryDto dto) {

    }
}
