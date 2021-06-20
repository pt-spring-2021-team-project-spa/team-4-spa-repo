package com.team7trek.trekDemo.repositories;

import com.team7trek.trekDemo.models.Trek;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekRepository extends CrudRepository<Trek, Long> {
    Optional<Trek> findByTitle(String title);
}
