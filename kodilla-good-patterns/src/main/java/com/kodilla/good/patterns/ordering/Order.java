package com.kodilla.good.patterns.ordering;

import java.time.LocalDateTime;

public class Order {

    private User user;
    private LocalDateTime date;
    private Product product;

    public Order(User user, LocalDateTime date, Product product) {
        this.user = user;
        this.date = date;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Product getProduct() {
        return product;
    }
}
