package com.team7trek.trekDemo.repositories;

import com.team7trek.trekDemo.models.Region;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RegionRepository extends CrudRepository<Region, Long> {
    Optional<Region> findByTitle(String title);
}
