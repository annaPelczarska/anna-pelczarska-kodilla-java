package com.kodilla.good.patterns.food2door;

public class OrderProcessorGlutenFreeShop implements OrderProcessor {

    Vendor vendor;

    public OrderProcessorGlutenFreeShop(Vendor vendor) {
        this.vendor = new Vendor("Gluten Free Shop","Butcher Str. 138");
    }

    public Vendor getVendor() {
        return vendor;
    }

    public OrderDto process(Order order) {
        if (order != null) {
            return new OrderDto(order.getVendor(), order.getProduct(), true);
        } else {
            System.out.println("Your cart is empty");
            return new OrderDto(order.getVendor(), order.getProduct(), false);
        }
    }

    public void confirm(OrderDto orderDto) {
        if (orderDto.isOrdered) {
            System.out.println("Your gluten-free treat consists of " + orderDto.getProduct());
        }
    }

    @Override
    public String toString() {
        return "OrderProcessorGlutenFreeShop{" +
                "vendor=" + vendor.getName() +
                '}';
    }
}
