package com.kodilla.good.patterns.food2door;

public class OrderProcessorOperator implements OrderProcessor {

    OrderProcessorExtraFoodShop orderProcessorExtraFoodShop;
    OrderProcessorGlutenFreeShop orderProcessorGlutenFreeShop;
    OrderProcessorHealthyShop orderProcessorHealthyShop;
    OrderProcessor orderProcessor;

    public OrderProcessorOperator (Order order) {

        if(order.getVendor().getName().equals("Extra Food Shop")){
        orderProcessor = orderProcessorExtraFoodShop;}
        else if(order.getVendor().getName().equals("Gluten Free Shop")){
        orderProcessor = orderProcessorGlutenFreeShop;}
        else if(order.getVendor().getName().equals("Healthy Shop")){
        orderProcessor = orderProcessorHealthyShop;}
    }

    public OrderDto process(Order order){

        if(!order.equals(null)){
            return new OrderDto(order.getVendor(), order.getProduct(), true);
        }
        else {
            System.out.println("Your cart is empty");
            return new OrderDto(order.getVendor(), order.getProduct(), false);
        }
    }
   public void confirm(OrderDto orderDto){

    }
}
