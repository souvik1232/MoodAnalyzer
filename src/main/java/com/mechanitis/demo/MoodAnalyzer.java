package com.mechanitis.demo;

public class MoodAnalyzer {
    public String analyseMood(String message) throws MoodAnalysisException {
        try {
            if (message.contains(("sad"))) {
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Please enter proper message");
        }
    }
}
