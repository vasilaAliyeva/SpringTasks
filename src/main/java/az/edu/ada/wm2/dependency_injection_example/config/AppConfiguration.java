package az.edu.ada.wm2.dependency_injection_example.config;

import az.edu.ada.wm2.dependency_injection_example.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {

    @Bean
    @Scope("prototype")
    public Person personBean() {

        Person person = new Person();

        person.setId("PER001");

        person.setFirstName("John");

        person.setLastName("Doe");

        return person;

    }

    @Bean
    @Scope("prototype")

    public Person anotherPersonBean() {

        return new Person("PER002", "Foo", "Bar");

    }
}
