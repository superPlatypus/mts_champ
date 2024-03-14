package com.example.history_system.web.controller;

import com.example.history_system.web.dto.DeliveryDto;
import com.example.history_system.web.dto.OrderDto;
import com.example.history_system.web.dto.ResourceDto;
import org.springframework.web.bind.annotation.RequestBody;

public interface HistoryController {
    void postResource(@RequestBody ResourceDto dto);
    void postOrder(@RequestBody OrderDto dto);
    void postDelivery(@RequestBody DeliveryDto dto);
}
