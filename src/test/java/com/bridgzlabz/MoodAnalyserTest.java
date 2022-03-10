package com.bridgzlabz;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.invokers.ExpectedExceptionsHolder;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_sadWhen_shouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Sad");
        String mood = moodAnalyser.analyseMood("This is a Sad message");
        //String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood,"SAD");
    }

    @Test
    public void givenMessage_whenNotSad_shouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Happy");
        String mood = moodAnalyser.analyseMood("This is a Happy message");
       // ExpectedExpection expectedExpection = ExpectedExpection.name();
        //String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood,"Happy");
    }

    @Test
    public void givenNullMoodReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(mood,"Happy");

    }
}
