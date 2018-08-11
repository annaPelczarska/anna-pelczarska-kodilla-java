package com.kodilla.good.patterns.ordering;

import java.time.LocalDateTime;

public class StandardOrderService implements OrderService{

   public boolean order(User user, LocalDateTime date, Product product){
       System.out.println("Order made by "+user.getName()+user.getSurname()+" at "+ date.toString()+" for "+product.getName());
        return true;
    }
}
