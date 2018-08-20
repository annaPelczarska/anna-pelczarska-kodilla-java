package com.kodilla.good.patterns.food2door;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vendor vendor = (Vendor) o;
        return Objects.equals(name, vendor.name) &&
                Objects.equals(address, vendor.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
