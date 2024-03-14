package com.example.delivery.models;

import java.util.Map;

public class Order {
    private Map<String, Integer> products;
    private String initDate;
    private String deliveryType;
    private String city;

    public Order(Map<String, Integer> products, String initDate, String deliveryType, String city) {
        this.products = products;
        this.initDate = initDate;
        this.deliveryType = deliveryType;
        this.city = city;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Integer> products) {
        this.products = products;
    }

    public String getInitDate() {
        return initDate;
    }

    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
