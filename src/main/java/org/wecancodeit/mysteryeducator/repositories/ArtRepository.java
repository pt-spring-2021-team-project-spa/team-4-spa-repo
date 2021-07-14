package org.wecancodeit.mysteryeducator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.mysteryeducator.models.Art;

public interface ArtRepository extends CrudRepository<Art, String> {
    Art findArtByApiLink(String apiLink);
}
