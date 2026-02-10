package az.edu.ada.wm2.dependency_injection_example.config;

import az.edu.ada.wm2.dependency_injection_example.beans.Order;
import az.edu.ada.wm2.dependency_injection_example.beans.Person;
import az.edu.ada.wm2.dependency_injection_example.beans.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ImportResource("classpath:applicationContext.xml")
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

//    @Bean
//    @Scope("prototype")
//
//    public Person anotherPersonBean() {
//
//        return new Person("PER002", "Foo", "Bar");
//
//    }
//    @Autowired
//    @Qualifier("productBean")
//    private Product defaultProduct;

//    @Bean
//    @Scope("prototype")
//    public Order orderBean(@Qualifier("personBean") Person person, @Qualifier("anotherPersonBean") Person defaultPerson) {
//        Order order = new Order();
//        order.setId("ORDER001");
//        order.setOwner(defaultPerson);
//        order.setProducts(new ArrayList<>(List.of(defaultProduct)));
//        order.setTotal(1200.00);
//        return order;
//    }

}
