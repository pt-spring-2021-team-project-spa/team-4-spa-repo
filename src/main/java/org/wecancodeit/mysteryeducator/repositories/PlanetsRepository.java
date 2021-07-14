package org.wecancodeit.mysteryeducator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.mysteryeducator.models.Planets;

public interface PlanetsRepository extends CrudRepository <Planets, String> {
    Planets findPlanetByName(String name);

}
