package com.kodilla.exception.test;

import java.util.*;
import java.util.stream.Collectors;


public class FlightSearcher {

    Flight flight;
    FlightMap flightMap;

    public FlightSearcher(Flight flight, FlightMap flightMap) {
        this.flight = flight;
        this.flightMap = flightMap;
    }


    public String findFlight(Flight flight, FlightMap flightMap) throws RouteNotFoundException {


        Set<String> departureAirportList = flightMap.getFlightMap().entrySet().stream()
                .map(e -> e.getKey())
                .collect(Collectors.toSet());

        if (!departureAirportList.contains(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("The airport of departure is not on the schedule");
        }

        List<String> directDestinationsList = flightMap.getFlightMap().get(flight.getDepartureAirport());
        boolean directFlightIsPossible = directDestinationsList.contains(flight.getArrivalAirport());

        List<String> departureAirportsWithConnectionToArrivalAirportList = flightMap.getFlightMap().entrySet().stream()
                .filter(e -> e.getValue().contains(flight.getArrivalAirport()))
                .map(e -> e.getKey())
                .collect(Collectors.toList());

        List<String> changeAirportsList = new ArrayList<>(directDestinationsList);
        directDestinationsList.retainAll(departureAirportsWithConnectionToArrivalAirportList);

        if (directFlightIsPossible) {
            return "You can book direct flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport();
        }
        else if (!changeAirportsList.equals(null)) {
            return "There's no direct connection. You can book flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " through " + changeAirportsList;
        } else {
            return "Flight to " + flight.getArrivalAirport() + " is not available";
        }
    }

}
