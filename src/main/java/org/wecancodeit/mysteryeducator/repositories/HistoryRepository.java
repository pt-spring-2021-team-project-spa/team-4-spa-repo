package org.wecancodeit.mysteryeducator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.mysteryeducator.models.History;

public interface HistoryRepository extends CrudRepository<History, Long> {
}
