package com.kodilla.good.patterns.food2door;

import java.util.*;

public class OrderProcessorOperator implements OrderProcessor {


    Map<Vendor, OrderProcessor> orderProcessorMap = new HashMap<>();
    List<OrderProcessor> orderProcessorList = new LinkedList<>();
    Order order;


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

        for (
                Map.Entry<Vendor, OrderProcessor> entry : orderProcessorMap.entrySet()) {
            entry.getValue().process(order);
        }

        if (!order.equals(null)) {
            return new OrderDto(order.getVendor(), order.getProduct(), true);
        } else {
            System.out.println("Your cart is empty");
            return new OrderDto(order.getVendor(), order.getProduct(), false);
        }

    }

    public void confirm(OrderDto orderDto) {

    }
}


