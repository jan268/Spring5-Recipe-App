package guru.springframework.Spring5Recipe.App.services;

import guru.springframework.Spring5Recipe.App.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipe();
}
