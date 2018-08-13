package com.kodilla.good.patterns.food2door;

public class OrderProcessorHealthyShop implements OrderProcessor {

    public OrderDto process(Order order) {
        boolean isOrdered = !order.equals(null);

        if (isOrdered) {
            return new OrderDto(order.getVendor(), order.getProduct(), true);
        } else {
            return new OrderDto(order.getVendor(), order.getProduct(), false);
        }
    }

    public void confirm(OrderDto orderDto) {
        System.out.println("Thank you for choosing Healthy Shop");
        if (orderDto.isOrdered) {
            System.out.println("You have successfully ordered " + orderDto.getProduct().getName());
        } else {
            System.out.println("Please make your order");
        }
    }
}