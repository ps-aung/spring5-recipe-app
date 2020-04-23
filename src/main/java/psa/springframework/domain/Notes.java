/**
 * 
 */
package psa.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

/**
 * Created by pyaesoneaung on 23/04/2020
 *
 */
@Entity
public class Notes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Recipe recipe;
	@Lob
	private String recipeNote;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the recipe
	 */
	public Recipe getRecipe() {
		return recipe;
	}
	/**
	 * @param recipe the recipe to set
	 */
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	/**
	 * @return the recipeNote
	 */
	public String getRecipeNote() {
		return recipeNote;
	}
	/**
	 * @param recipeNote the recipeNote to set
	 */
	public void setRecipeNote(String recipeNote) {
		this.recipeNote = recipeNote;
	}
	
	
	 

}
