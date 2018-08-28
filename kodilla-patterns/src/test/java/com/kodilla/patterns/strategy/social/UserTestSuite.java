package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User gary = new YGeneration("Gary");
        User frank = new ZGeneration("Frank");
        User zoe = new Millenials("Zoe");
        //When
        String garyPosting = gary.sharePost();
        System.out.println("When Gary posts he's " + garyPosting);
        String frankPosting = frank.sharePost();
        System.out.println("When Frank posts he's " + frankPosting);
        String zoePosting = zoe.sharePost();
        System.out.println("When Zoe posts she's " + zoePosting);
        //Then
        Assert.assertEquals(garyPosting, "sharing on Facebook");
        Assert.assertEquals(frankPosting, "sharing on Twitter");
        Assert.assertEquals(zoePosting, "sharing on Snapchat");
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User jess = new Millenials("Jess");
        //When
        String jessPosting = jess.sharePost();
        System.out.println("When Jess posted last year she used to be "+jessPosting);
        jess.setSocialPublisher(new TwitterPublisher());
        jessPosting = jess.sharePost();
        System.out.println("Now when Jess posts she's "+jessPosting);
    }
}
