package com.example.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class SoccerCoach implements Coach{

//    public SoccerCoach() {
//        System.out.println("Constructor:" + getClass().getSimpleName());
//    }

    @Override
    public String runDailyWorkout() {
        return "Practice long pass ";
    }
}
