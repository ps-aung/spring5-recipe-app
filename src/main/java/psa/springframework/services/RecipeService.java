package psa.springframework.services;

import java.util.Set;

import psa.springframework.domain.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();

	Recipe findById(Long l);
}
