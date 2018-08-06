package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge challenge = new SecondChallenge();
        try { challenge.probablyIWillThrowException(4.0, 1.6);
        }
        catch(Exception e)  {
            System.out.println("Oh no! Error: " + e);
        }

     /*   FlightSearcher flightSearcher = new FlightSearcher();
        try{*/

               // flightSearcher.findFilght(flights.get(n));

       /* }
        catch(RouteNotFoundException e){
            System.out.println("Flight not scheduled "+e);
        }

*/

    }
}
