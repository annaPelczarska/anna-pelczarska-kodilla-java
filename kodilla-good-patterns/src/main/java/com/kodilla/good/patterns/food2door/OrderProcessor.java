package com.kodilla.good.patterns.food2door;

public interface OrderProcessor {

   OrderDto process(Order order);
   void confirm(OrderDto orderDto);
}
