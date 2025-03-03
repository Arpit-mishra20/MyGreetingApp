package com.springapicalls.RestApiCalls;

import com.springapicalls.RestApiCalls.model.Greeting;
import com.springapicalls.RestApiCalls.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // Endpoint to get a default greeting message
    @GetMapping
    public String getGreeting() {
        return greetingService.getGreeting();
    }

    // Endpoint to get a greeting message by first name
    @GetMapping("/firstName")
    public String getGreetingByFirstName(@RequestParam String firstName) {
        return greetingService.getGreeting(firstName);
    }

    // Endpoint to get a greeting message by full name
    @GetMapping("/fullName")
    public String getGreetingByFullName(@RequestParam String firstName, @RequestParam String lastName) {
        return greetingService.getGreeting(firstName, lastName);
    }

    // Endpoint to save a greeting message
    @PostMapping
    public Greeting saveGreeting(@RequestBody String message) {
        return greetingService.saveGreeting(message);
    }

    // Endpoint to retrieve all saved greetings
    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    // Additional methods for updating and deleting greetings can be added here
}