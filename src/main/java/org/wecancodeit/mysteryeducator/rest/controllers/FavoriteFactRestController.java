package org.wecancodeit.mysteryeducator.rest.controllers;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.mysteryeducator.models.FavoriteFact;
import org.wecancodeit.mysteryeducator.repositories.FavoriteFactRepository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class FavoriteFactRestController {

    @Resource
    private FavoriteFactRepository favoriteFactRepo;

    @GetMapping("/api/favoritefact")
    public Collection<FavoriteFact> getFavoriteFact() {
    return (Collection<FavoriteFact>) favoriteFactRepo.findAll();
    }

    @PostMapping("/api/favoritefact/add")
    public Collection<FavoriteFact> addFavoriteFact(@RequestBody String body) throws JSONException {
        JSONObject newFavoriteFact = new JSONObject(body);
        String favoriteFact = newFavoriteFact.getString("favoriteFact");
        Optional<FavoriteFact> favoriteFactToAddOpt = favoriteFactRepo.findByFavoriteFact(favoriteFact);
        if (favoriteFactToAddOpt.isEmpty()) {
            FavoriteFact favoriteFactToAdd = new FavoriteFact(favoriteFact);
            favoriteFactRepo.save(favoriteFactToAdd);
        }
        return (Collection<FavoriteFact>) favoriteFactRepo.findAll();
    }
}
