package com.AitBenOm.springdemo;

public class SadFortuneService implements  FortuneService {

    @Override
    public String getFortune() {
        return "To Day is a sad day !!";
    }
}
