package org.wecancodeit.mysteryeducator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.mysteryeducator.models.Art;

import java.util.Optional;

public interface ArtRepository extends CrudRepository<Art, Long> {
    Optional<Art> findById(Long id);
}
