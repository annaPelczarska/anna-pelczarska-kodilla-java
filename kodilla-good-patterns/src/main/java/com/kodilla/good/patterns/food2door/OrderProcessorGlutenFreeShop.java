package com.kodilla.good.patterns.food2door;

public class OrderProcessorGlutenFreeShop implements OrderProcessor {

    private final Vendor glutenFreeShop = new Vendor("Gluten Free Shop", "Butcher Str. 138");
    boolean isOrderProcessed;


    public Vendor getVendor() {
        return glutenFreeShop;
    }

    public boolean process(Order order) {
        if (order != null) {
            return isOrderProcessed = true;
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
                "vendor=" + glutenFreeShop.getName() +
                '}';
    }
}
