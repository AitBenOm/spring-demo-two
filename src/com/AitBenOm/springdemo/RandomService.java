package com.AitBenOm.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements FortuneService {

    private String []data = {
            "dfghsdfhsdfhdshsdhsdfhsd",
            "dfhsdfghfdghdfghdfghfgh",
            "dfghdfghdfghdfghfgh"
    };

    private Random myRand = new Random();

    @Override
    public String getFortune() {
        int index = myRand.nextInt(data.length)  ;
        return data[index];
    }
}
