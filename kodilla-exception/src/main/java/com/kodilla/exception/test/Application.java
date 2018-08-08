package com.kodilla.exception.test;

public class Application {

    public static void main(String args[]) {

        FlightSearcher flightSearcher = new FlightSearcher();
        Flight flight1 = new Flight("New York", "Wakanda");

        try {

            flightSearcher.findFlight(flight1);
            System.out.println(flightSearcher.findFlight(flight1));

        } catch (RouteNotFoundException e) {
            System.out.println("Flight not scheduled " + e);
        }

    }
}
