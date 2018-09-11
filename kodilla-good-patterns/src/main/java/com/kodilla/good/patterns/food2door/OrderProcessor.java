package com.kodilla.good.patterns.food2door;

public interface OrderProcessor {

    boolean process(Order order) throws EmptyOrderException;

    void confirm(Order order);

    Vendor getVendor();
}
