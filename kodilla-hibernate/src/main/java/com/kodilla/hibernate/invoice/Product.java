package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCTS")
public final class Product {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private int id;

    @Column(name = "PRODUCT_NAME")
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }
}
