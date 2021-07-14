package org.wecancodeit.mysteryeducator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.mysteryeducator.models.HashTag;

import java.util.Optional;

public interface HashTagRepository extends CrudRepository<HashTag, Long> {
        Optional<HashTag> findByName(String hashTagName);
}

