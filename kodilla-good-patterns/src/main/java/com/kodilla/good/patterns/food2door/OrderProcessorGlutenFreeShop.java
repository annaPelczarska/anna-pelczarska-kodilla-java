package com.kodilla.good.patterns.food2door;

public class OrderProcessorGlutenFreeShop implements OrderProcessor {

    Vendor vendor;
    boolean isOrderProcessed;

    public OrderProcessorGlutenFreeShop(Vendor vendor) {
        this.vendor = new Vendor("Gluten Free Shop","Butcher Str. 138");
    }

    public Vendor getVendor() {
        return vendor;
    }

    public boolean process(Order order) {
        if (order != null) {
            return isOrderProcessed = true ;
        } else {
            System.out.println("Your cart is empty");
            return isOrderProcessed = false;
        }
    }

    public void confirm(Order order) {
        if (isOrderProcessed) {
            System.out.println("Your gluten-free treat consists of " + order.getProduct());
        }
    }

    @Override
    public String toString() {
        return "OrderProcessorGlutenFreeShop{" +
                "vendor=" + vendor.getName() +
                '}';
    }
}
