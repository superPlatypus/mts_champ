package com.example.delivery.models;

public class Courier {
    private String type;
    private int capacity;
    private int speed;

    public Courier(String type, int capacity, int speed) {
        this.type = type;
        this.capacity = capacity;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
