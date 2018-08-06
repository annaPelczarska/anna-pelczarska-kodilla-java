package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Destinations {

    private List arrivalAirports;

    public Destinations(List arrivalAirports) {
        this.arrivalAirports = arrivalAirports;
    }

    public List getArrivalAirports() {
        return arrivalAirports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destinations that = (Destinations) o;
        return Objects.equals(arrivalAirports, that.arrivalAirports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrivalAirports);
    }

    Destinations wakanda = new Destinations(Arrays.asList("New York","Geneva"));


}
