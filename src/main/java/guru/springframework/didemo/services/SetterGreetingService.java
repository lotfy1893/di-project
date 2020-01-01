package guru.springframework.didemo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("setterGreetingService")
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hey From Setter Junk";
    }
}
