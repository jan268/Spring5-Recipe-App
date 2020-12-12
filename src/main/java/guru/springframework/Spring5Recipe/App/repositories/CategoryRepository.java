package guru.springframework.Spring5Recipe.App.repositories;

import guru.springframework.Spring5Recipe.App.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
