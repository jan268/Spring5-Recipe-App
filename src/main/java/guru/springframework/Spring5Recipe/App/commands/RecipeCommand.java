package guru.springframework.Spring5Recipe.App.commands;

import guru.springframework.Spring5Recipe.App.domain.Category;
import guru.springframework.Spring5Recipe.App.domain.Difficulty;
import guru.springframework.Spring5Recipe.App.domain.Ingredient;
import guru.springframework.Spring5Recipe.App.domain.Notes;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {

    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Difficulty difficulty;
    private Byte[] image;
    private NotesCommand notes;
    private Set<IngredientCommand> ingredients = new HashSet<>();
    private Set<CategoryCommand> categories = new HashSet<>();
}
