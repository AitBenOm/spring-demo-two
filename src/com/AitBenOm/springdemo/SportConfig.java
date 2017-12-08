package com.AitBenOm.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.AitBenOm.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    //define bean for our sad fortune service

    @Bean
    public FortuneService restFullService(){
        return new RestFulService();
    }

    //define bean for our swim and inject dependency
    @Bean
    public Coach swimCoach(){
        return  new SwimCoach(restFullService());
    }


}
