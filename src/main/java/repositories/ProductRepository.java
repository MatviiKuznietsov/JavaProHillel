package repositories;

import model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.persistence.Id;

public interface ProductRepository extends JpaRepository<Product, Long> {
}