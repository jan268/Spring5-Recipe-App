package guru.springframework.Spring5Recipe.App.services;

import guru.springframework.Spring5Recipe.App.commands.RecipeCommand;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);

}
