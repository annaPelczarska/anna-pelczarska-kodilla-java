package com.kodilla.stream.world;

import com.kodilla.stream.com.kodilla.stream.world.Continent;
import com.kodilla.stream.com.kodilla.stream.world.Country;
import com.kodilla.stream.com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        //When
        List<Country> europeList = new ArrayList<>();
        europeList.add(new Country("France", new BigDecimal("80000000")));
        europeList.add(new Country("Spain", new BigDecimal("60000000")));

        List<Country> asiaList = new ArrayList<>();
        asiaList.add(new Country("Russia", new BigDecimal("600000000")));
        asiaList.add(new Country("China", new BigDecimal("900000000")));
        asiaList.add(new Country("Mongolia", new BigDecimal("900000")));

        List<Country> australiaList = new ArrayList<>();
        australiaList.add(new Country("Australia", new BigDecimal("5000000")));
        australiaList.add(new Country("Tasmania", new BigDecimal("2000")));

        world.getContinentList().add(new Continent("Europe",europeList));
        world.getContinentList().add(new Continent("Asia",asiaList));
        world.getContinentList().add(new Continent("Australia",australiaList));

        world.getContinentList().stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .forEach(System.out::println);

        //Then
        Assert.assertEquals(3,world.getContinentList().size());
        BigDecimal expectedPeopleQ = new BigDecimal("1645902000");
        Assert.assertEquals("text",expectedPeopleQ, world.getPeopleQuantity());
    }
}
