/**
 * 
 */
package psa.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import psa.springframework.domain.Recipe;

/**
 * Created by pyaesoneaung on 23/04/2020
 *
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
