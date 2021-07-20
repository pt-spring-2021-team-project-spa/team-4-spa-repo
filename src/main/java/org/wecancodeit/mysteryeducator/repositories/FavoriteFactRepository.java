package org.wecancodeit.mysteryeducator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.mysteryeducator.models.FavoriteFact;

import java.util.Optional;

public interface FavoriteFactRepository extends CrudRepository<FavoriteFact, String> {
    Optional<FavoriteFact> findByFavoriteFact(String favoriteFact);
}