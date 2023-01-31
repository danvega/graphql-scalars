package dev.danvega.graphqlscalars.repository;

import dev.danvega.graphqlscalars.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductRepository extends ListCrudRepository<Product, Integer> {
}
