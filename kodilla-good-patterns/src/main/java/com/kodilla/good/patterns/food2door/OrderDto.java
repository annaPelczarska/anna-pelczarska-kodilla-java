package com.kodilla.good.patterns.food2door;

public class OrderDto {

    public Vendor vendor;
    public Product product;
    public boolean isOrdered;

    public OrderDto(final Vendor vendor, final Product product, final boolean isOrdered) {
        this.vendor = vendor;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    @Override
    public String toString() {
        return "Your order {" +
                "from " + vendor +
                " is completed. Summary: " + product +
                '}';
    }
}
