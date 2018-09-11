package com.kodilla.exception.test;

public class Application {

    public static void main(String args[]) {

        FlightMap flightMap = new FlightMap();
        Flight flight1 = new Flight("Wakanda", "Gotham");
        FlightSearcher flightSearcher = new FlightSearcher(flightMap);
        try {
            String flightPossibility = (flightSearcher.isFlightPossible(flight1)) ? "available" : "not on the schedule";
            System.out.println("Flight you're searching for is: " + flightPossibility);

        } catch (RouteNotFoundException e) {
            System.out.println("Flight not scheduled " + e);
        }
    }
}
