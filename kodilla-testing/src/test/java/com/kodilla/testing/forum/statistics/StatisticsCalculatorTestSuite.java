package com.kodilla.testing.forum.statistics;

import org.junit. *;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testCalculateAdvStatisticsPostSum1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //When
        int postSum1 = statisticsCalculator.getPostsSum();
        //Then
        Assert.assertEquals(1000, postSum1);
    }
    @Test
    public void testCalculateAdvStatisticsPostSum0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //When
        int postSum0 = statisticsCalculator.getPostsSum();
        //Then
        Assert.assertEquals(0, postSum0);
    }
    @Test
    public void testCalculateAdvStatisticsCommentSum0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //When
        int commentsSum0 = statisticsCalculator.getCommentsSum();
        //Then
        Assert.assertEquals(0, commentsSum0);
    }
    @Test
    public void testCalculateAdvStatisticsCommentSum1LessThanPostSum() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(100);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //When
        double average1 = statisticsCalculator.getCommentAvPPost();
        //Then
        Assert.assertEquals(0.5, average1,0);
    }
    @Test
    public void testCalculateAdvStatisticsCommentSumGraterThanPostSum() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(50);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //When
        double average2 = statisticsCalculator.getCommentAvPPost();
        //Then
        Assert.assertEquals(2, average2,0);
    }
    @Test
    public void testCalculateAdvStatisticsUserCount0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(usersNames);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //When
        int userSum1 = statisticsCalculator.getUserSum();
        //Then
        Assert.assertEquals(0, userSum1);
    }
    @Test
    public void testCalculateAdvStatisticsUserCount1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int n=0; n <100; n++){
            usersNames.add("user"+n);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //When
        int userSum1 = statisticsCalculator.getUserSum();
        //Then
        Assert.assertEquals(100, userSum1);
        }

}
