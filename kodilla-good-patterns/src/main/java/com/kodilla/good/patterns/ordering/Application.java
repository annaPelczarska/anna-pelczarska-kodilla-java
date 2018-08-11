package com.kodilla.good.patterns.ordering;

public class Application {

    public static void main(String[] args){

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new StandardOrderLog(),new StandardOrderService());
        orderProcessor.process(order
        );
    }
}
