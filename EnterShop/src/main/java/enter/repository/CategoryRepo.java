package enter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import enter.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, String> {

}
