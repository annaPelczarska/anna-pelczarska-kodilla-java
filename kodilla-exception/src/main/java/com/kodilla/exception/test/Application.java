package com.kodilla.exception.test;

public class Application {

    public static void main(String args[]) {

        FlightMap flightMap = new FlightMap();
        Flight flight1 = new Flight("Wakanda", "Gotham");
        FlightSearcher flightSearcher = new FlightSearcher(flight1, flightMap);
        try {

            flightSearcher.findFlight(flight1, flightMap);
            System.out.println(flightSearcher.findFlight(flight1, flightMap));

        } catch (RouteNotFoundException e) {
            System.out.println("Flight not scheduled " + e);
        }
    }
}
