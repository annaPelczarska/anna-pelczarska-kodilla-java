package com.kodilla.good.patterns.airLines;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightValidator {

    FlightMap flightMap = new FlightMap();

    public boolean validateFlight(Flight flight) {

        Set<String> allArrivalAirportsSet = flightMap.getFlightMap().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.toSet());

        if (flight.arrivalAirport == null || flight.departureAirport == null) {
            return false;
        } else if (flightMap.getFlightMap().get(flight.getDepartureAirport()).isEmpty() ||
                (!allArrivalAirportsSet.contains(flight.getArrivalAirport()))) {
            return false;
        } else {
            return true;
        }
    }
}
