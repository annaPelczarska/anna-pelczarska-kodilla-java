package com.kodilla.good.patterns.ordering;

public class OrderDto {
    public User user;
    public boolean isOrdered;
    public Product product;

    public OrderDto(final User user, final boolean isOrdered, final Product product) {
        this.user = user;
        this.isOrdered = isOrdered;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public Product getProduct() {
        return product;
    }
}
