package com.kodilla.good.patterns.food2door;

import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        List<OrderProcessor> orderProcessorList = new LinkedList<>();

        OrderProcessor orderProcessorExtraFoodShop = new OrderProcessorExtraFoodShop(order.getVendor());
        OrderProcessor orderProcessorGlutenFreeShop = new OrderProcessorGlutenFreeShop(order.getVendor());
        OrderProcessor orderProcessorHealthyShop = new OrderProcessorHealthyShop(order.getVendor());

        orderProcessorList.add(orderProcessorExtraFoodShop);
        orderProcessorList.add(orderProcessorGlutenFreeShop);
        orderProcessorList.add(orderProcessorHealthyShop);

        OrderProcessor orderProcessorOperator = new OrderProcessorOperator(orderProcessorList);

        System.out.println("Thank you for shopping with Food2Door at " + order.getVendor().getName());

        try {
            orderProcessorOperator.process(order);
            orderProcessorOperator.confirm(order);

        } catch (Exception e) {
            System.out.println("Oh no! Error: " + e);
        }
    }
}
