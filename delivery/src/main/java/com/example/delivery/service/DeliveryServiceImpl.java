package com.example.delivery.service;

import com.example.delivery.models.Courier;
import com.example.delivery.models.Delivery;
import com.example.delivery.models.Order;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class DeliveryServiceImpl implements DeliveryService {
    private Order order;
    private Delivery delivery;
    private Courier courierAuto = new Courier("Automobile", 20, 1);
    private Courier courierBike = new Courier("Bike", 10, 2);
    private Courier courierFoot = new Courier("On foot", 5, 3);
    //private String[] allowedCities = new String[]{"Moscow", "SPB", "Novosib", "EKB"};
    private List<String> allowedCities = new ArrayList<String>();

    public DeliveryServiceImpl() {
        allowedCities.add("Moscow");
        allowedCities.add("SPB");
        allowedCities.add("Novosib");
        allowedCities.add("EKB");
    }


    public void createDelivery(Order order) throws InterruptedException {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : order.getProducts().entrySet()) {
            sum = sum + entry.getValue();
        }
        if (sum <= 10) {
            delivery.setCourier(courierBike);
        } else if (sum <= 5) {
            delivery.setCourier(courierFoot);
        }
        else delivery.setCourier(courierAuto);
        Thread.sleep(delivery.getCourier().getSpeed()*1000);
        delivery.setStatus("Заказ созданный " + delivery.getOrder().getInitDate() + " доставлен успешно в " + delivery.getOrder().getCity());
        if (!allowedCities.contains(order.getCity())) {
            delivery.setStatus("Заказ не может быть доставлен");
        }

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8081/history-api/v1/delivery";
        HttpEntity<Delivery> requestEntity = new HttpEntity<>(delivery);
        restTemplate.exchange(url, HttpMethod.POST, requestEntity);
    }

}
