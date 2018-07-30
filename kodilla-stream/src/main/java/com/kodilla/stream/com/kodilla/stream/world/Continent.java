package com.kodilla.stream.com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {

    private String continentName;
    private List<Country> countryList = new ArrayList<Country>();

    public Continent(String continentName, List<Country> countryList) {
        this.continentName = continentName;
        this.countryList = countryList;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}