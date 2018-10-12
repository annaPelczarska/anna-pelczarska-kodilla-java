package com.kodilla.good.patterns.airLines;

public class Application {

    public static void main(String args[]) {

        String departureAirport1 = "Sokovia";
        String arrivalAirport1 = "Gotham";
        Flight flight1 = new Flight(departureAirport1, arrivalAirport1);

        FlightValidator flightValidator = new FlightValidator();
        FlightMap flightMap = new FlightMap();
        FlightSearcher flightSearcher = new FlightSearcher(flightMap);


        if (flightValidator.validateFlight(flight1)) {

            System.out.println("From " + departureAirport1 + " you can go directly to: " + flightSearcher.whereCanIGoFrom(departureAirport1));
            System.out.println("Direct connections to: " + arrivalAirport1 + " are available from: " + flightSearcher.whereFromCanIGoTo(arrivalAirport1));
            System.out.println("The flight from: "+ departureAirport1 +" to: "+ arrivalAirport1+" is currently "+(flightSearcher.isFlightFromToPossible(flight1)? "possible": "not possible")+" with our airlines");
        }
        else System.out.println("The destinations or flights that you're looking for are not on our schedule");
    }
}
