package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightMap {

    public Map<String, List<String>> getFlightMap() {

        List<String> flightsFromWakanda = new ArrayList<>();
        flightsFromWakanda.add("New York");
        flightsFromWakanda.add("Geneva");

        List<String> flightsFromNewYork = new ArrayList<>();
        flightsFromNewYork.add("Edinburgh");
        flightsFromNewYork.add("Geneva");
        flightsFromNewYork.add("Wakanda");
        flightsFromNewYork.add("Gotham");

        List<String> flightsFromSokovia = new ArrayList<>();
        flightsFromSokovia.add("Edinburgh");
        flightsFromSokovia.add("Geneva");

        List<String> flightsFromGotham = new ArrayList<>();
        flightsFromGotham.add("Wakanda");
        flightsFromGotham.add("Geneva");
        flightsFromGotham.add("New York");

        List<String> flightsFromGeneva = new ArrayList<>();
        flightsFromNewYork.add("Edinburgh");
        flightsFromNewYork.add("Gotham");

        Map<String, List<String>> flightMap = new HashMap<>();
        flightMap.put("Wakanda", flightsFromWakanda);
        flightMap.put("New York", flightsFromNewYork);
        flightMap.put("Sokovia", flightsFromSokovia);
        flightMap.put("Gotham", flightsFromGotham);

        return flightMap;
    }

}
