package com.kodilla.good.patterns.airLines;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSearcher {

    FlightMap flightMap;
    Flight flight;

    public FlightSearcher(FlightMap flightMap) {
        this.flightMap = flightMap;
    }

    public List<String> whereCanIGoFrom(String departureAirport){

        return flightMap.getFlightMap().get(departureAirport);
    }

    public List<String> whereFromCanIGoTo(String arrivalAirport){

        List<String> listOfAirportsWithConnectionTo = flightMap.getFlightMap().entrySet().stream()
                .filter(e -> e.getValue().contains(arrivalAirport))
                .map(e -> e.getKey())
                .collect(Collectors.toList());
        return listOfAirportsWithConnectionTo;
    }

    public boolean isFlightFromToPossible(Flight flight){

        List<String> arrivalAirportList = flightMap.getFlightMap().get(flight.getDepartureAirport());

        if(arrivalAirportList.contains(flight.getArrivalAirport())){
            return true;
        }
        for (String aAirport : arrivalAirportList) {
            if (isFlightFromToPossible(new Flight(aAirport, flight.getArrivalAirport()))) {
                return true;
            }
        }
        return false;
    }

}
