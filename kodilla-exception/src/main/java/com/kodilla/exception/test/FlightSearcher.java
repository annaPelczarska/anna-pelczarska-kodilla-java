package com.kodilla.exception.test;

import java.util.*;
import java.util.stream.Collectors;


public class FlightSearcher {

    FlightMap flightMap;

    public FlightSearcher(FlightMap flightMap) {
        this.flightMap = flightMap;
    }
    int i = 0;

    public boolean isFlightPossible(Flight flight) throws RouteNotFoundException {
        i++;
        System.out.println(i);
        System.out.println("departure: "+flight.getDepartureAirport()+" arrival: "+flight.getArrivalAirport());

        List<String> arrivalAirportList = flightMap.getFlightMap().get(flight.getDepartureAirport());
        System.out.println(flight.getDepartureAirport());
        System.out.println(arrivalAirportList);

        if(arrivalAirportList == null){
          throw new RouteNotFoundException("You cannot get anywhere from this airport" +flight.getDepartureAirport());
        }

        if (arrivalAirportList.contains(flight.getArrivalAirport())) {
            System.out.println("direct flight possible.");
            return true;
        }

        for(String aAirport : arrivalAirportList){
            if(isFlightPossible( new Flight(aAirport,flight.arrivalAirport))){
                return true;
            }
        }
        throw new RouteNotFoundException("Journey from "+flight.getDepartureAirport()+" to "+flight.arrivalAirport+" is not scheduled.");
    }

}
