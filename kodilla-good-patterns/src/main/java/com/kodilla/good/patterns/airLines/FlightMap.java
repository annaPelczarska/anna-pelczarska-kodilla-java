package com.kodilla.good.patterns.airLines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightMap {


    public Map<String, List<String>> getFlightMap() {

        List<String> flightsFromWakanda = new ArrayList<>();
        flightsFromWakanda.add("New York");
        flightsFromWakanda.add("Sokovia");

        List<String> flightsFromNewYork = new ArrayList<>();
        flightsFromNewYork.add("Geneva");
        flightsFromNewYork.add("Edinburgh");
        flightsFromNewYork.add("Wakanda");
        flightsFromNewYork.add("Gotham");

        List<String> flightsFromSokovia = new ArrayList<>();
        flightsFromSokovia.add("Edinburgh");
        flightsFromSokovia.add("Geneva");
        flightsFromSokovia.add("Wakanda");

        List<String> flightsFromGotham = new ArrayList<>();
        flightsFromGotham.add("Wakanda");
        flightsFromGotham.add("Geneva");
        flightsFromGotham.add("New York");

        List<String> flightsFromGeneva = new ArrayList<>();
        flightsFromGeneva.add("Wakanda");
        flightsFromGeneva.add("Gotham");

        List<String> flightsFromEdinburgh = new ArrayList<>();
        flightsFromEdinburgh.add("Wakanda");
        flightsFromEdinburgh.add("New York");

        Map<String, List<String>> flightMap = new HashMap<>();
        flightMap.put("Wakanda", flightsFromWakanda);
        flightMap.put("New York", flightsFromNewYork);
        flightMap.put("Sokovia", flightsFromSokovia);
        flightMap.put("Gotham", flightsFromGotham);
        flightMap.put("Geneva", flightsFromGeneva);
        flightMap.put("Edinburgh", flightsFromEdinburgh);

        return flightMap;
    }

    @Override
    public String toString() {
        return "FlightMap{}";
    }
}
