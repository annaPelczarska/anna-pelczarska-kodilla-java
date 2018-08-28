package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    public void testGetLastLog(){

       logger.getInstance().log("Captain's Log entry");
       logger.getInstance().getLastLog();

       Assert.assertEquals(logger.getInstance().getLastLog(),"Captain's Log entry");
    }
}
