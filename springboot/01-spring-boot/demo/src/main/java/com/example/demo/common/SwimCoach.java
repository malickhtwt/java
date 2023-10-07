package com.example.demo.common;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("Bean Example: " + getClass().getSimpleName());
    }

    @Override
    public String runDailyWorkout() {
        return "Do a 100m deep dive";
    }
}
