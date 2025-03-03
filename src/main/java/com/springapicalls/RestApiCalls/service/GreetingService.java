package com.springapicalls.RestApiCalls.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreeting(){
        return "Hello World";
    }
    public String getGreeting(String firstName){
        return "Hello, "+firstName+"!";
    }
    public String getGreeting(String firstName,String lastName){
        return "Hello, "+firstName+" "+lastName+"!";
    }


}
