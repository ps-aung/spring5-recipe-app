/**
 * 
 */
package psa.springframework.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import psa.springframework.domain.UnitOfMeasure;

/**
 * Created by pyaesoneaung on 23/04/2020
 *
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
	
	Optional<UnitOfMeasure> findByDescription(String description);

}
