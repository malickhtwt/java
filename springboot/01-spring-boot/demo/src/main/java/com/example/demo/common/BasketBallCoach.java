package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach{

//    public BasketBallCoach() {
//        System.out.println("Constructor:" + getClass().getSimpleName());
//    }

    @Override
    public String runDailyWorkout() {
        return "3 points shooting practice";
    }
}
