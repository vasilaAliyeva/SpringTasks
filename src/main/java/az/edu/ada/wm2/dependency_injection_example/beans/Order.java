package az.edu.ada.wm2.dependency_injection_example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Order {

    private String id;

    private Person owner;

    @Autowired(required = false)
    private List<Product> products;

    @Value("0.0")
    private Double total;

    @Autowired
    public Order(@Qualifier("personBean") Person owner) {
        this.owner = owner;
    }
    public void setId(String id) {

        this.id = id;
    }

    @Autowired
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
