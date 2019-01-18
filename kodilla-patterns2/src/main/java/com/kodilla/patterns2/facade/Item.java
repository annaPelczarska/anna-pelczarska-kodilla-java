package com.kodilla.patterns2.facade;

public class Item {

    private final Long productId;
    private final double qty;

    public Item(Long productId, double qry) {
        this.productId = productId;
        this.qty = qry;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQty() {
        return qty;
    }
}
