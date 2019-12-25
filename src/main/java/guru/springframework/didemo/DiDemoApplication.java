package guru.springframework.didemo;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author  Lotfy H.
 *
 */
@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = applicationContext.getBean(MyController.class);
        myController.hello();

        System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(applicationContext.getBean(SetterInjectedController.class).sayHello());
        System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());
    }

}
