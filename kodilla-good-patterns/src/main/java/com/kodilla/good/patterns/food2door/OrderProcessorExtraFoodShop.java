package com.kodilla.good.patterns.food2door;

public class OrderProcessorExtraFoodShop implements OrderProcessor {

    @Override
   public OrderDto process(Order order){

       if(order.equals(null)){
         // throw new EmptyOrderException("Order has not been entered. Please try again");
           System.out.println("Order has not been entered. Please try again");
       }
       return new OrderDto(order.getVendor(), order.getProduct(), true);
   }

   public void confirm(OrderDto orderDto){
       System.out.println(orderDto);
   }

}
