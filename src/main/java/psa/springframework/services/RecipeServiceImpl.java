package psa.springframework.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import psa.springframework.commands.RecipeCommand;
import psa.springframework.converters.RecipeCommandToRecipe;
import psa.springframework.converters.RecipeToRecipeCommand;
import psa.springframework.domain.Recipe;
import psa.springframework.repositories.RecipeRepository;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
	
	private final RecipeRepository recipeRepository;
	private final RecipeCommandToRecipe recipeCommandToRecipe;
	private final RecipeToRecipeCommand recipeToRecipeCommand;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository,RecipeCommandToRecipe recipeCommandToRecipe,RecipeToRecipeCommand recipeToRecipeCommand) {
		// TODO Auto-generated constructor stub
		this.recipeRepository = recipeRepository;
		this.recipeCommandToRecipe = recipeCommandToRecipe;
		this.recipeToRecipeCommand = recipeToRecipeCommand;
	}

	@Override
	public Set<Recipe> getRecipes() {
		// TODO Auto-generated method stub
		log.debug("I'm in the Service");
		Set<Recipe> recipes = new HashSet<>();
		recipeRepository.findAll().forEach(recipes::add);
		return recipes;
	}

	@Override
	public Recipe findById(Long l) {
		Optional<Recipe> recipeOptional = recipeRepository.findById(l);

		if (!recipeOptional.isPresent()) {
			throw new RuntimeException("Recipe Not Found!");
		}

		return recipeOptional.get();
	}

	@Override
	@Transactional
	public RecipeCommand saveRecipeCommand(RecipeCommand command) {
		Recipe detachedRecipe = recipeCommandToRecipe.convert(command);

		Recipe savedRecipe = recipeRepository.save(detachedRecipe);
		log.debug("Saved RecipeId:" + savedRecipe.getId());
		return recipeToRecipeCommand.convert(savedRecipe);
	}

}
