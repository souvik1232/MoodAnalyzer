package com.mechanitis.demo;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis() throws Exception {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("This is a sad message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

//    @Test
//    public void givenNullMoodShouldReturnHappy() {
//        MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
//        String mood = null;
//        try {
//            ExpectedException exceptionRule = ExpectedException.none();
//            exceptionRule.expect(MoodAnalysisException.class);
//            mood = moodAnalyzer.analyseMood(null);
//            Assert.assertEquals("HAPPY",mood);
//        } catch (MoodAnalysisException e) {
//            e.printStackTrace();
//        }
//    }
}