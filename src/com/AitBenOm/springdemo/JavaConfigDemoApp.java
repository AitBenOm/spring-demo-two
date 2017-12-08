package com.AitBenOm.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        //Load the spring configuration file java File
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        //retreive bean
        Coach theCoach =context.getBean( TennisCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
