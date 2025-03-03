package com.springapicalls.RestApiCalls.service;

import com.springapicalls.RestApiCalls.model.Greeting;
import com.springapicalls.RestApiCalls.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    @Autowired
    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGreeting() {
        return "Hello World";
    }

    public String getGreeting(String firstName) {
        return "Hello, " + firstName + "!";
    }

    public String getGreeting(String firstName, String lastName) {
        return "Hello, " + firstName + " " + lastName + "!";
    }

    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }

    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    public Optional<Greeting> findGreetingById(Long id) {
        return greetingRepository.findById(id);
    }

    // New method to update a greeting by ID
    public Optional<Greeting> updateGreeting(Long id, String newMessage) {
        Optional<Greeting> optionalGreeting = greetingRepository.findById(id);
        if (optionalGreeting.isPresent()) {
            Greeting greeting = optionalGreeting.get();
            greeting.setMessage(newMessage);
            return Optional.of(greetingRepository.save(greeting));
        }
        return Optional.empty(); // Return empty if the greeting is not found
    }
}