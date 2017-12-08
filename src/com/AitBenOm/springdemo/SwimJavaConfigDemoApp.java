package com.AitBenOm.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        //Load the spring configuration file java File
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        //retreive bean
        SwimCoach theCoach =context.getBean("swimCoach" ,SwimCoach.class);

        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

        context.close();
    }
}
