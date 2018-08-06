package com.kodilla.exception.test;

import java.util.*;

public class FlightSearcher {

    Map<String, List> flightMap = new HashMap<>();

    public Map<String, List> getFlightMap() {
        return flightMap;
    }

    public String findFilght(Flight flight) throws RouteNotFoundException {

        flightMap.put("Wakanda", Arrays.asList("New York", "Geneva"));
        flightMap.put("New York", Arrays.asList("New York", "Geneva", "Wakanda", "Gotham"));
        flightMap.put("Sokovia", Arrays.asList("Edinburgh", "Geneva"));
        flightMap.put("Edinburgh", Arrays.asList("Wakanda", "Geneva", "New York"));
        flightMap.put("Gotham", Arrays.asList("New York", "Wakanda"));
        flightMap.put("Geneva", Arrays.asList("New York", "Edinburgh", "Wakanda"));

        FlightSearcher flightSearcher = new FlightSearcher();

        for (Map.Entry<String, List> entry : flightMap.entrySet()) {
            if (!(entry.getKey().contains(flight.getDepartureAirport()))) {
                throw new RouteNotFoundException("This flight is not on the schedule");
            }

        Boolean flightIsPossible = flightSearcher.getFlightMap().stream()
                .map(entry ->entry.getKey().stream())
                .filter(dc->dc.equals(flight.getDepartureAirport()))
                .map(dc->get(dc))
                .reduce(true,l->l.contains(flight.getArrivalAirport()));
        }

        if (flightIsPossible == true) {
            return "You can book flight to " + flight.getArrivalAirport();
        } else {
            return "Flight to " + flight.getArrivalAirport() + " is not available";
        }
    }

}
