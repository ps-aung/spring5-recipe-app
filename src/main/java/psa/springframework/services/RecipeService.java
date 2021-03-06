package psa.springframework.services;

import java.util.Set;

import psa.springframework.commands.RecipeCommand;
import psa.springframework.domain.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();

	Recipe findById(Long l);

	RecipeCommand findCommandById(Long l);

	RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long l);
}
