package com.AitBenOm.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice your Pec !!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public TennisCoach() {

    }
   @Autowired
    public TennisCoach(@Qualifier("randomService") FortuneService fortuneService) {

        System.out.println("Qualifier Constructor");
        this.fortuneService = fortuneService;
    }

    @PostConstruct
    public void doMyStuff(){
        System.out.println("inside soMyStuff");
    }

    @PreDestroy
    public void clearMyStuff(){
        System.out.println("inside clearMyStuff");
    }
    public FortuneService getFortuneService() {
        return fortuneService;
    }
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }
}
