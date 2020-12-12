package guru.springframework.Spring5Recipe.App.repositories;

import guru.springframework.Spring5Recipe.App.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
