package com.kodilla.good.patterns.food2door;


import java.time.LocalDateTime;

public class Order {

    private User user;
    private Vendor vendor;
    private Product product;
    private double quantity;
    private LocalDateTime date;

    public Order(User user, Vendor vendor, Product product, double quantity, LocalDateTime date) {
        this.user = user;
        this.vendor = vendor;
        this.product = product;
        this.quantity = quantity;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", vendor=" + vendor +
                ", product=" + product +
                ", quantity=" + quantity +
                ", date=" + date +
                '}';
    }
}
