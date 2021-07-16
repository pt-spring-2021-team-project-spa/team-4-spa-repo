package org.wecancodeit.mysteryeducator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.mysteryeducator.models.History;
import java.util.Optional;

public interface HistoryRepository extends CrudRepository <History, Long> {
    Optional<History> findById(Long id);
}


