package org.wecancodeit.mysteryeducator.repositories;

import org.springframework.data.repository.CrudRepository;

public interface ArtRepository extends CrudRepository<ArtRepository, String> {
    ArtRepository findArtByArtworkTitle(String artworkTitle);
}
