package com.kodilla.exception.test;

import java.util.*;
import java.util.stream.Collectors;


public class FlightSearcher {


    public Map<String, List<String>> getFlightMap() {

        List<String> flightsFromWakanda = new ArrayList<>();
        flightsFromWakanda.add("New York");
        flightsFromWakanda.add("Geneva");

        List<String> flightsFromNewYork = new ArrayList<>();
        flightsFromNewYork.add("Edinburgh");
        flightsFromNewYork.add("Geneva");
        flightsFromNewYork.add("Wakanda");
        flightsFromNewYork.add("Gotham");

        List<String> flightsFromSokovia = new ArrayList<>();
        flightsFromSokovia.add("Edinburgh");
        flightsFromSokovia.add("Geneva");

        List<String> flightsFromGotham = new ArrayList<>();
        flightsFromGotham.add("Wakanda");
        flightsFromGotham.add("Geneva");
        flightsFromGotham.add("New York");

        Map<String, List<String>> flightMap = new HashMap<>();
        flightMap.put("Wakanda", flightsFromWakanda);
        flightMap.put("New York", flightsFromNewYork);
        flightMap.put("Sokovia", flightsFromSokovia);
        flightMap.put("Gotham", flightsFromGotham);

        return flightMap;
    }

    public String findFlight(Flight flight) throws RouteNotFoundException {

        FlightSearcher flightSearcher = new FlightSearcher();

        Set<String> departureAirportList = flightSearcher.getFlightMap().entrySet().stream()
                .map(e -> e.getKey())
                .collect(Collectors.toSet());

        if (!departureAirportList.contains(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("The airport of departure is not on the schedule");
        }

        Set<String> arrivalAirportsList = flightSearcher.getFlightMap().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.toSet());

        Boolean flightIsPossible = arrivalAirportsList.contains(flight.getArrivalAirport());


        if (flightIsPossible) {
            return "You can book flight to " + flight.getArrivalAirport();
        } else {
            return "Flight to " + flight.getArrivalAirport() + " is not available";
        }
    }

}
