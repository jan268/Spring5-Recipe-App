package guru.springframework.Spring5Recipe.App.services;

import guru.springframework.Spring5Recipe.App.commands.IngredientCommand;
import guru.springframework.Spring5Recipe.App.domain.Ingredient;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
