package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        HomeworkQueue janeHomeworkQueue = new JaneHomeworkQueue();
        HomeworkQueue jackyHomeworkQueue = new JackyHomeworkQueue();
        HomeworkQueue joeHomeworkQueue = new JoeHomeworkQueue();
        Mentor walterWise = new Mentor("Walter","Wise");
        Mentor kateKnowledgeable = new Mentor("Kate","Knowledgeable");
        janeHomeworkQueue.registerObserver(walterWise);
        jackyHomeworkQueue.registerObserver(walterWise);
        joeHomeworkQueue.registerObserver(kateKnowledgeable);
        //When
        janeHomeworkQueue.submitHomwork("super script");
        jackyHomeworkQueue.submitHomwork("likable link");
        jackyHomeworkQueue.submitHomwork("likable link.v2");
        jackyHomeworkQueue.submitHomwork("likable link.v3");
        joeHomeworkQueue.submitHomwork("exhausting exercise");
        joeHomeworkQueue.submitHomwork("memorable memo");

        //Then
        assertEquals(4,walterWise.getUpdateCount());
        assertEquals(2,kateKnowledgeable.getUpdateCount());

    }

}