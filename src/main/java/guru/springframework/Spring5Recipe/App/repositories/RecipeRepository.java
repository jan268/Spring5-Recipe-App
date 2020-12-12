package guru.springframework.Spring5Recipe.App.repositories;

import guru.springframework.Spring5Recipe.App.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
