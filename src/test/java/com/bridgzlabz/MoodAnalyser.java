package com.bridgzlabz;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood()  {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "Happy";
        } catch (NullPointerException e){
            return "Happy";
            //throw new MoodAnalysisException("please enter valid message");
        }

    }
}
