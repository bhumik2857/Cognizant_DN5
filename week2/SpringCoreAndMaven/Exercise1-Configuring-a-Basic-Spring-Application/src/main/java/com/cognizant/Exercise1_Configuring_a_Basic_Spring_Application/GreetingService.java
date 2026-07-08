package com.cognizant.Exercise1_Configuring_a_Basic_Spring_Application;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public void greeting(){
        System.out.println("Hello bhumika gupta");
        System.out.println("Welcome to Spring Boot!");
    }
}
