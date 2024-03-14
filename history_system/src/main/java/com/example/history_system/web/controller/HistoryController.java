package com.example.history_system.web.controller;

import com.example.history_system.web.dto.DeliveryDto;
import com.example.history_system.web.dto.OrderDto;
import com.example.history_system.web.dto.ResourceDto;
import org.springframework.web.bind.annotation.RequestBody;

public interface HistoryController {
    /**
     * get resource to post
     * @param dto to post
     * */
    void postResource(@RequestBody ResourceDto dto);
    /**
     * get order to post
     * @param dto to post
     * */
    void postOrder(@RequestBody OrderDto dto);
    /**
     * get delivery to post
     * @param dto to post
     * */
    void postDelivery(@RequestBody DeliveryDto dto);
}
