package com.springapicalls.RestApiCalls;

import com.springapicalls.RestApiCalls.model.Greeting;
import com.springapicalls.RestApiCalls.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public String getGreeting() {
        return greetingService.getGreeting();
    }

    @GetMapping("/firstName")
    public String getGreetingByFirstName(@RequestParam String firstName) {
        return greetingService.getGreeting(firstName);
    }

    @GetMapping("/fullName")
    public String getGreetingByFullName(@RequestParam String firstName, @RequestParam String lastName) {
        return greetingService.getGreeting(firstName, lastName);
    }

    @PostMapping
    public Greeting saveGreeting(@RequestBody String message) {
        return greetingService.saveGreeting(message);
    }

    // Endpoint to retrieve all saved greetings
    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    @GetMapping("/{id}")
    public Optional<Greeting> findGreetingById(@PathVariable Long id) {
        return greetingService.findGreetingById(id);
    }
}