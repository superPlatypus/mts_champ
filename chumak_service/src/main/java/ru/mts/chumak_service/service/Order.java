package ru.mts.chumak_service.service;

public class Order {

    protected String selectedProduct;
    protected int count;
    protected String dateOrder;
    protected String typeDelivery;
    protected String city;

    public Order(String selectedProduct, int count, String dateOrder, String typeDelivery, String city) {
        this.selectedProduct = selectedProduct;
        this.count = count;
        this.dateOrder = dateOrder;
        this.typeDelivery = typeDelivery;
        this.city = city;
    }

    public String getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(String selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getTypeDelivery() {
        return typeDelivery;
    }

    public void setTypeDelivery(String typeDelivery) {
        this.typeDelivery = typeDelivery;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
