package enter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import enter.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {


}
