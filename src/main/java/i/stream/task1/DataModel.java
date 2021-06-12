package i.stream.task1;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

public class DataModel {
}

@Data
@Entity
@NoArgsConstructor
class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer tier;
}

@Data
@NoArgsConstructor
@Entity
@Table(name = "product_order")
class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "order_product_relationship",
            joinColumns = { @JoinColumn(name = "order_id") },
            inverseJoinColumns = { @JoinColumn(name = "product_id") }
    )
    @ToString.Exclude
    Set<Product> products;

}


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    @With
    private Double price;

    @ManyToMany(mappedBy = "products")
    @ToString.Exclude
    private Set<Order> orders;
}
