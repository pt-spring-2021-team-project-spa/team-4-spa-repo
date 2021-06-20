package com.team7trek.trekDemo.repositories;

import com.team7trek.trekDemo.models.Continent;
import org.springframework.data.repository.CrudRepository;

public interface ContinentRepository extends CrudRepository <Continent, Long> {
    Continent findContinentByLocation(String location);
}
