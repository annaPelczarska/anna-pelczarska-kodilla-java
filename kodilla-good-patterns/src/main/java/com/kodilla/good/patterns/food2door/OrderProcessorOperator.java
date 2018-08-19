package com.kodilla.good.patterns.food2door;

import java.util.*;

public class OrderProcessorOperator implements OrderProcessor {

    OrderProcessorExtraFoodShop orderProcessorExtraFoodShop;
    OrderProcessorGlutenFreeShop orderProcessorGlutenFreeShop;
    OrderProcessorHealthyShop orderProcessorHealthyShop;


    Vendor vendor;

    List<OrderProcessor> orderProcessorList = new LinkedList<>();

    Map<Vendor, OrderProcessor> orderProcessorMap = new HashMap<>();

    public OrderProcessorOperator(Vendor vendor) {

       /* orderProcessorList.add(orderProcessorExtraFoodShop);
        orderProcessorList.add(orderProcessorGlutenFreeShop);
        orderProcessorList.add(orderProcessorHealthyShop);*/

        this.orderProcessorMap = orderProcessorMap;
       // this.vendor = vendor;

        if (vendor.getName().equals("Extra Food Shop")) {
            orderProcessorMap.put(orderProcessorExtraFoodShop.getVendor(), orderProcessorExtraFoodShop);
        } else if (vendor.getName().equals("Gluten Free Shop")) {
            orderProcessorMap.put(orderProcessorGlutenFreeShop.getVendor(), orderProcessorGlutenFreeShop);
        } else if (vendor.getName().equals("Healthy Shop")) {
            orderProcessorMap.put(orderProcessorHealthyShop.getVendor(), orderProcessorHealthyShop);
        }
    }

    public Map<Vendor, OrderProcessor> getOrderProcessorMap() {
        return orderProcessorMap;
    }

    public OrderDto process(Order order) {

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
