package com.kodilla.good.patterns.food2door;

public class Application {

    OrderProcessor orderProcessor;
    OrderProcessor orderProcessorExtraFoodShop;
    OrderProcessor orderProcessorGlutenFreeShop;
    OrderProcessor orderProcessorHealthyShop;
    OrderProcessor orderProcessorOperator;

    public Application(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        OrderProcessorExtraFoodShop orderProcessorExtraFoodShop = new OrderProcessorExtraFoodShop(order.getVendor());

        OrderProcessor orderProcessor = orderProcessorExtraFoodShop;
                //new OrderProcessorOperator(order.getVendor());
                //orderProcessorOperator.getOrderProcessorMap().get(order.getVendor());
                //.getOrderProcessorMap().get(order.getVendor());
                //new OrderProcessorOperator(order);


        System.out.println(order.getVendor().getName());

        try {
            orderProcessor.process(order);
            orderProcessor.confirm(orderProcessor.process(order));
        } catch (Exception e) {
            System.out.println("Oh no! Error: " + e);
        }
    }
}
