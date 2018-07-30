package com.kodilla.stream.com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private String countryName;
    private BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public final BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                '}';
    }
}
