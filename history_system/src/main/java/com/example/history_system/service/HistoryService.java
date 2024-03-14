package com.example.history_system.service;

import com.example.history_system.web.dto.DeliveryDto;
import com.example.history_system.web.dto.OrderDto;
import com.example.history_system.web.dto.ResourceDto;

public interface HistoryService {
    /**
     * post resource to db
     * @param dto to post
     * */
    void postResource(ResourceDto dto);
    /**
     * post order to db
     * @param dto to post
     * */
    void postOrder(OrderDto dto);
    /**
     * post delivery to db
     * @param dto to post
     * */
    void postDelivery(DeliveryDto dto);
}
