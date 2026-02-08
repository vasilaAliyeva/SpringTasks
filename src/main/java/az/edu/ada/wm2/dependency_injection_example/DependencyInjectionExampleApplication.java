package az.edu.ada.wm2.dependency_injection_example;

import az.edu.ada.wm2.dependency_injection_example.beans.Person;
import az.edu.ada.wm2.dependency_injection_example.beans.Product;
import az.edu.ada.wm2.dependency_injection_example.config.AppConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyInjectionExampleApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DependencyInjectionExampleApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Product product = (Product) context.getBean("productBean");

        System.out.println(product);

        Product product2 = context.getBean("productBean", Product.class);

        System.out.println(product2);

        System.out.println(product == product2);


        ApplicationContext appContext = new
                AnnotationConfigApplicationContext(AppConfiguration.class);

        Person person1 = appContext.getBean("personBean", Person.class); //by type only

        System.out.println(person1);



        Person person2 = appContext.getBean("personBean", Person.class); //by name

        System.out.println(person2);


        System.out.println(person1 == person2);

        Person person3 = appContext.getBean("anotherPersonBean", Person.class);

        System.out.println(person3);
    }

}
