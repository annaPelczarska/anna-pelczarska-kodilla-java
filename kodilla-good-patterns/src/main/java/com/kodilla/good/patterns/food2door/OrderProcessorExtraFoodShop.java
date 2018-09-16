package com.kodilla.good.patterns.food2door;

public class OrderProcessorExtraFoodShop implements OrderProcessor {

    private final Vendor extraFoodShop = new Vendor("Extra Food Shop", "Sesame Str. 18");
    boolean isOrderProcessed;

    public Vendor getVendor() {
        return extraFoodShop;
    }

    @Override
    public boolean process(Order order) throws EmptyOrderException {

        if (order == null) {
            throw new EmptyOrderException("Order has not been entered. Please try again");
        } else {
            return isOrderProcessed = true;
        }
    }

    public void confirm(Order order) {
        if (isOrderProcessed) {
            System.out.println("You've ordered following extra food: " + order.getProduct().getName());
        } else {
            System.out.println("there's no order made");
        }
    }

    @Override
    public String toString() {
        return "OrderProcessorExtraFoodShop{" +
                "vendor=" + extraFoodShop.getName() +
                '}';
    }
}
