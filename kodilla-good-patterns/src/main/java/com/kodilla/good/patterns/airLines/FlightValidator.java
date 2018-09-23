package com.kodilla.good.patterns.airLines;

public class FlightValidator {

    FlightMap flightMap;

    public boolean validateFlight(Flight flight) {

        if (flight.arrivalAirport == null || flight.departureAirport == null) {
            return false;
        }

        else if(!(flightMap.getFlightMap().get(flight.getDepartureAirport()).contains(flight.getArrivalAirport()))){
            return false;}

        return true;
    }
}
