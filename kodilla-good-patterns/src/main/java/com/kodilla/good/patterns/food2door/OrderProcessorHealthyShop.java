package com.kodilla.good.patterns.food2door;

public class OrderProcessorHealthyShop implements OrderProcessor {

    Vendor healthyShop = new Vendor("Healthy Shop", "Kale Str. 666");
    boolean isOrderProcessed;

    public Vendor getVendor() {
        return healthyShop;
    }

    public boolean process(Order order) {
        if (order != null) {
            return isOrderProcessed = true;
        } else {
            return isOrderProcessed = false;
        }
    }

    public void confirm(Order order) {
        System.out.println("Thank you for choosing Healthy Shop");
        if (isOrderProcessed) {
            System.out.println("You have successfully ordered " + order.getProduct().getName());
        } else {
            System.out.println("Please make your order");
        }
    }

    @Override
    public String toString() {
        return "OrderProcessorHealthyShop{" +
                "vendor=" + healthyShop.getName() +
                '}';
    }
}
