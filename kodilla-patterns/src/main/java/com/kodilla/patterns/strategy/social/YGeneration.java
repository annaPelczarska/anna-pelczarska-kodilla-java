package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;

public class YGeneration extends User {

    public YGeneration(String name){
        super (name);
        this.socialPublisher = new FacebookPublisher();
    }
}
