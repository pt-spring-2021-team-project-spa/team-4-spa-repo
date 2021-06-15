package com.team7trek.trekDemo;

import org.springframework.data.repository.CrudRepository;

public interface ContinentRepository extends CrudRepository<Continent, Long> {
    Continent findContinentByLocation(String location);

}
