package guru.springframework.didemo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_BABY = "Hey Sweetheart :D";
    @Override
    public String sayGreeting() {
        return HELLO_BABY;
    }
}
