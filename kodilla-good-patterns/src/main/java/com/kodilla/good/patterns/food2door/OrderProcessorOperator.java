package com.kodilla.good.patterns.food2door;

import java.util.*;

public class OrderProcessorOperator implements OrderProcessor {

    Map<Vendor, OrderProcessor> orderProcessorMap = new HashMap<>();
    OrderRetriever retriever = new OrderRetriever();
    Order order = retriever.retrieve();

    public Vendor getVendor() {
        return order.getVendor();
    }

    public OrderProcessorOperator(List<OrderProcessor> orderProcessorList) {

        for (OrderProcessor p : orderProcessorList) {
            orderProcessorMap.put(p.getVendor(), p);
        }
    }

    public Map<Vendor, OrderProcessor> getOrderProcessorMap() {
        return orderProcessorMap;
    }

    @Override
    public boolean process(Order order) throws EmptyOrderException {

        if (order != null && orderProcessorMap.get(order.getVendor()) != null) {
            orderProcessorMap.get(order.getVendor()).process(order);
            return true;
        } else {
            throw new EmptyOrderException("Please re-submit your order");
        }
    }

    public void confirm(Order order) {
        orderProcessorMap.get(order.getVendor()).confirm(order);


    }
}


