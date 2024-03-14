package com.example.history_system.service.impl;

import com.example.history_system.data.entity.DeliveryEntity;
import com.example.history_system.data.entity.OrderEntity;
import com.example.history_system.data.entity.ResourceEntity;
import com.example.history_system.data.repository.DeliveryRepository;
import com.example.history_system.data.repository.OrderRepository;
import com.example.history_system.data.repository.ResourceRepository;
import com.example.history_system.service.HistoryService;
import com.example.history_system.web.dto.DeliveryDto;
import com.example.history_system.web.dto.OrderDto;
import com.example.history_system.web.dto.ResourceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HistoryServiceImpl implements HistoryService {
    private final ResourceRepository resourceRepository;
    private final OrderRepository orderRepository;
    private final DeliveryRepository deliveryRepository;
    @Override
    public void postResource(ResourceDto dto) {
        ResourceEntity entity = new ResourceEntity();
        entity.setResourceType(dto.getResourceType());
        entity.setAmount(dto.getAmount());
        resourceRepository.save(entity);
    }

    @Override
    public void postOrder(OrderDto dto) {
        OrderEntity entity = new OrderEntity();
        entity.setAmount(dto.getAmount());
        entity.setCity(dto.getCity());
        entity.setProduct(dto.getProduct());
        entity.setDeliveryType(dto.getDeliveryType());
        orderRepository.save(entity);
    }

    @Override
    public void postDelivery(DeliveryDto dto) {
        var entity = new DeliveryEntity();
        entity.setCity(dto.getCity());
        entity.setCourierType(dto.getCourierType());
        entity.setStatus(dto.getStatus());
        deliveryRepository.save(entity);
    }
}
