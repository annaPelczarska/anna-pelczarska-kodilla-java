package com.kodilla.good.patterns.ordering;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class StandardOrderLog implements OrderLog {

    List<Order> orderList = new LinkedList<>();
    OrderRetriever orderRetriever = new OrderRetriever();

    @Override
    public void log(User user, LocalDateTime date, Product product){
     orderList.add(orderRetriever.retrieve());
    }
}
