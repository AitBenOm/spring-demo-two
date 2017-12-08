package com.AitBenOm.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScoopDemoApp {
    public static void main(String[] args) {

        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retreive bean
        Coach theCoach =context.getBean("tennisCoach" ,Coach.class);
        Coach alphaCoach =context.getBean("tennisCoach" ,Coach.class);

        System.out.println(theCoach == alphaCoach);
       // System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
