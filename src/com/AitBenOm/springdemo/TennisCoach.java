package com.AitBenOm.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("restFulService")
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
  //  @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }
}
