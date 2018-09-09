package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class OrderRetriever {

    public Order retrieve(){ 

        User user = new User("John", "Roe");
        Vendor vendor = new Vendor("Extra Food Shop","Sesame Str. 18");
        LocalDateTime date = LocalDateTime.of(2018,7, 16,11,30);
        Product product = new Product("carrots",5.20);

        return new Order(user,vendor,product,1.5,date);
    }
}
