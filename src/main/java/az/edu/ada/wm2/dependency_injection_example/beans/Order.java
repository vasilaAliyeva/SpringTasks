package az.edu.ada.wm2.dependency_injection_example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Order {

    private String id;

    @Autowired
    @Qualifier("personBean")
    private Person owner;

    @Autowired
    private List<Product> products;

    private Double total;

    public Order() {}

    public Order(String id, Person owner, List<Product> products, Double total) {
        this.id = id;
        this.owner = owner;
        this.products = products;
        this.total = total;

    }
    public void setId(String id) {

        this.id = id;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public void setTotal(Double total) {
        this.total = total;

    }
    public String getId() {
        return id;
    }
    public Person getOwner() {
        return owner;
    }
    public List<Product> getProducts() {
        return products;
    }
    public Double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", owner=" + owner +
                ", products=" + products +
                ", total=" + total +
                '}';
    }
}
