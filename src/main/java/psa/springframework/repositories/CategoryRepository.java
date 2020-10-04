/**
 * 
 */
package psa.springframework.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import psa.springframework.domain.Category;

/**
 * Created by pyaesoneaung on 23/04/2020
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

	Optional<Category> findByDescription(String description);
	
	

}
