package com.kodilla.stream.com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

        public class World {

            private List<Continent> continentList = new ArrayList<Continent>();

            public List<Continent> getContinentList() {
                return continentList;
            }

            public BigDecimal getPeopleQuantity(){
                return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                        .map(country -> country.getPeopleQuantity())
                        .reduce(BigDecimal.ZERO, (sum,current)-> sum.add(current));
}

}
