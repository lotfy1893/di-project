package guru.springframework.didemo;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;


    @Before
    public void setUp(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_BABY, this.constructorInjectedController.sayHello());
    }
}
