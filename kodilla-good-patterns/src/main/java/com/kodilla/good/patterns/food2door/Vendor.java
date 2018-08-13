package com.kodilla.good.patterns.food2door;

public class Vendor {

    private String name;
    private String address;

    public Vendor(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
