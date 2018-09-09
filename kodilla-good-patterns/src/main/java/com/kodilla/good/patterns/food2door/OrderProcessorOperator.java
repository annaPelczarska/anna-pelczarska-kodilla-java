package com.kodilla.good.patterns.food2door;

import java.util.*;

public class OrderProcessorOperator implements OrderProcessor {


    Map<Vendor, OrderProcessor> orderProcessorMap = new HashMap<>();
    List<OrderProcessor> orderProcessorList = new LinkedList<>();
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

    @Override
    public OrderDto process(Order order) throws EmptyOrderException {

        if (order != null) {
            orderProcessorMap.get(order.getVendor()).process(order);
            return new OrderDto(order.getVendor(), order.getProduct(), true);
        } else {
            System.out.println("Your cart is empty");
            return new OrderDto(order.getVendor(), order.getProduct(), false);
        }
    }
    public void confirm(OrderDto orderDto) {
        orderProcessorMap.get(order.getVendor()).confirm(orderDto);
    }
}


