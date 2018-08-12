package com.kodilla.good.patterns.food2door;

public class Application {

    OrderProcessor orderProcessor;

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        order.getVendor();
        OrderProcessor orderProcessor = new OrderProcessorHealthyShop();

        orderProcessor.process(order);
        orderProcessor.confirm(orderProcessor.process(order));
    }
}
