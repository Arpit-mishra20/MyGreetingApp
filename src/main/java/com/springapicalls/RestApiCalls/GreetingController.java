package com.springapicalls.RestApiCalls;

import com.springapicalls.RestApiCalls.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService){
        this.greetingService=greetingService;
    }
    @GetMapping
    public String getGreeting(){
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
    @PutMapping
   public String putHello(@RequestBody String message) {
               return "Updated message: "+message;
            }
    @PostMapping
    public String postHello(@RequestBody String message) {

                return "Posted message"+message;
            }


    @DeleteMapping
    public String deleteGreeting() {
        return "Deleted hello message:";
    }
}
