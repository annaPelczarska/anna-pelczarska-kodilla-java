package com.kodilla.good.patterns.ordering;

import java.time.LocalDateTime;

public class OrderRetriever {

    public Order retrieve(){

        User user = new User("John", "Wick");
        LocalDateTime date = LocalDateTime.of(2018,7, 16,11,30);
        Product product = new Product("white shirt",169.99);

        return new Order(user,date,product);
    }
}
