package com.AitBenOm.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RestFulService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your RestFull day!" ;
    }
}
