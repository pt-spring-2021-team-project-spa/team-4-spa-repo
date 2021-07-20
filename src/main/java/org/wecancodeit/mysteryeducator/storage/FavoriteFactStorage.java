package org.wecancodeit.mysteryeducator.storage;

import org.wecancodeit.mysteryeducator.models.FavoriteFact;

public interface FavoriteFactStorage {
    void store(FavoriteFact favoriteFactToStore);
}
