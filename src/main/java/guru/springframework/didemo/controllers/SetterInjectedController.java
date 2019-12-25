package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return this.greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService (GreetingService greetingService){
       this.greetingService = greetingService;
    }
}
