package guru.springframework.didemo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("constructorGreetingService")
@Qualifier("constructorGreetingService")
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hey from the Constructor junk!";
    }
}
