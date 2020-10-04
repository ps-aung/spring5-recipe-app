/**
 * 
 */
package psa.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import psa.springframework.services.RecipeService;

/**
 * Created by pyaesoneaung on 22/04/2020
 *
 */
@Slf4j
@Controller
public class IndexController {
	
	private final RecipeService recipeService;

	/**
	 * @param recipeService
	 */
	public IndexController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}

	@RequestMapping({"","/","/index"})
	public String getIndexPage(Model model) {
		log.debug("Getting Index Page");
		model.addAttribute("recipes",recipeService.getRecipes());
		return "index";
	}

}
