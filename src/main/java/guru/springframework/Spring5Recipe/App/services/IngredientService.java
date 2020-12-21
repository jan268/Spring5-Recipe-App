package guru.springframework.Spring5Recipe.App.services;

import guru.springframework.Spring5Recipe.App.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
