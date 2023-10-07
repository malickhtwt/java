package com.example.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Primary
public class CricketCoach implements Coach{

    @Override
    public String runDailyWorkout() {
        return "5K Run";
    }

//    @PostConstruct
//    public void doBefore() {
//        System.out.println("some method(): " + getClass().getSimpleName());
//    }

//    @PreDestroy
//    public void doAfter() {
//        System.out.println("some method(): " + getClass().getSimpleName());
//    }
}
