package com.kodilla.good.patterns.food2door;

public class OrderProcessorExtraFoodShop implements OrderProcessor {

    Vendor vendor;

    public OrderProcessorExtraFoodShop(Vendor vendor) {
        this.vendor = vendor;
    }

    public Vendor getVendor() {
        return vendor;
    }

    @Override
    public OrderDto process(Order order) throws EmptyOrderException {

        if (order.equals(null)) {
            throw new EmptyOrderException("Order has not been entered. Please try again");

        }
        return new OrderDto(order.getVendor(), order.getProduct(), true);
    }

    public void confirm(OrderDto orderDto) {
        System.out.println(orderDto);
    }

}
