package com.springapicalls.RestApiCalls;

import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @GetMapping
    public String getGreeting(){
        return "{\"message\": \"Hello, World!\"}";
    }
    @PutMapping
   public String putGreeting(@RequestBody Map<String, String> request) {
                String name = request.get("name");
                return "{\"message\": \"Updated greeting for " + name + "!\"}";
            }
    @PostMapping
    public String postGreeting(@RequestBody Map<String, String> request) {
                String name = request.get("name");
                return "{\"message\": \"Hello, " + name + "!\"}";
            }


    @DeleteMapping
    public String deleteGreeting() {
        return "{\"message\": \"Greeting deleted!\"}";
    }
}
