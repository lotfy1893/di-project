package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return this.greetingService.sayGreeting();
    }
}
