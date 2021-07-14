package org.wecancodeit.mysteryeducator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.mysteryeducator.models.Planets;

import java.util.Optional;

public interface PlanetsRepository extends CrudRepository <Planets, Long> {
    Optional<Planets> findById(Long id);

}
