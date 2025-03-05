package com.springapicalls.RestApiCalls.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
    @PostMapping("/hello")
    public String postHello(@RequestBody String message){
        return "Posted message: "+message;
    }
    @PutMapping("/hello")
    public String putHello(@RequestBody String message){
        return  "Updated message: "+message;
    }
    @DeleteMapping("/hello")
    public String deleteHello(){
        return "Deleted hello message";
    }
}
