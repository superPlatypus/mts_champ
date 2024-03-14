package com.example.history_system.service;

import com.example.history_system.web.dto.DeliveryDto;
import com.example.history_system.web.dto.OrderDto;
import com.example.history_system.web.dto.ResourceDto;

public interface HistoryService {
    void postResource(ResourceDto dto);
    void postOrder(OrderDto dto);
    void postDelivery(DeliveryDto dto);
}
