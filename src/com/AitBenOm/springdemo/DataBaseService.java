package com.AitBenOm.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DataBaseService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your DataBase day" ;
    }
}
