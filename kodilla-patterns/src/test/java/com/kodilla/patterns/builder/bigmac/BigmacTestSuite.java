package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .sauce("1000 islands")
                .burgers(2)
                .ingredient("lettuce")
                .ingredient("shrimps")
                .ingredient("chili peppers")
                .ingredient("onion")
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertEquals(4, howManyIngredients);
    }
}
