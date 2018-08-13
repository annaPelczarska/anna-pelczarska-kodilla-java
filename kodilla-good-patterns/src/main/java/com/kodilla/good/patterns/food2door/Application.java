package com.kodilla.good.patterns.food2door;

public class Application {

    OrderProcessor orderProcessor;

    public Application(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessorHealthyShop();
                //new OrderProcessorOperator(order);

        System.out.println(order.getVendor().getName());

        try {
            orderProcessor.process(order);
            orderProcessor.confirm(orderProcessor.process(order));
        }catch (Exception e){
            System.out.println("Oh no! Error: " + e);
        }
    }
}
