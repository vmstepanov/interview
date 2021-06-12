package i.stream.task1;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Task1 {

    private void task() {

        CrudRepository<Product, Long> productRepo = null;

        List<Product> source = StreamSupport.stream(productRepo.findAll().spliterator(), false)
                .collect(Collectors.toList());

        // Obtain a list of products belongs to category “Books” with price > 100

        {
            List<Product> result = source.stream()
                    .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                    .filter(p -> p.getPrice() > 100)
                    .collect(Collectors.toList());
        }

        // Obtain a list of order with products belong to category “Baby”

        {
            List<Order> orders = source.stream()
                    .filter(p->p.getCategory().equals("Baby")).flatMap(p->p.getOrders().stream()).collect(Collectors.toList());
        }
    }
}
