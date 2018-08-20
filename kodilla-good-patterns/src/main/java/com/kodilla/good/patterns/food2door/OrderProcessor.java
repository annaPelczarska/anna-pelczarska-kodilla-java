package com.kodilla.good.patterns.food2door;

public interface OrderProcessor {

    OrderDto process(Order order) throws EmptyOrderException;

    void confirm(OrderDto orderDto);

    public Vendor getVendor();
}
