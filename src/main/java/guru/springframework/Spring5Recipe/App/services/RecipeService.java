package guru.springframework.Spring5Recipe.App.services;

import guru.springframework.Spring5Recipe.App.commands.RecipeCommand;
import guru.springframework.Spring5Recipe.App.domain.Recipe;

import java.util.Optional;
import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipe();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
