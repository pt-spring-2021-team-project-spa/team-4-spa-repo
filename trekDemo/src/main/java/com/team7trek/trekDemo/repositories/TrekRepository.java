package com.team7trek.trekDemo.repositories;

import com.team7trek.trekDemo.models.Trek;
import org.springframework.data.repository.CrudRepository;

public interface TrekRepository extends CrudRepository<Trek, Long> {
}
