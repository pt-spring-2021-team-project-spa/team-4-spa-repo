package org.wecancodeit.mysteryeducator.rest.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.mysteryeducator.models.FavoriteFact;
import org.wecancodeit.mysteryeducator.models.Planets;
import org.wecancodeit.mysteryeducator.repositories.PlanetsRepository;
import org.wecancodeit.mysteryeducator.repositories.FavoriteFactRepository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class PlanetsRestController {
    @Resource
    private PlanetsRepository planetsRepo;

    @Resource
    private FavoriteFactRepository favoriteFactRepo;

    @GetMapping("/api/planets")
    public Collection<Planets> getPlanets() {
        return (Collection<Planets>) planetsRepo.findAll();
    }

    @GetMapping("/api/planets/{id}")

    public Optional<Planets> getPlanets(@PathVariable Long id) {
        return planetsRepo.findById(id);
    }

    @PostMapping("/api/planets/{id}/add-favorite-fact")
    public Optional<Planets> addFavoriteFactToPlanet(@RequestBody String body, @PathVariable Long id) throws JSONException {
        JSONObject newFavoriteFact = new JSONObject(body);
        String favoriteFact = newFavoriteFact.getString("favoriteFact");
       Optional<FavoriteFact> favoriteFactToAddOpt = favoriteFactRepo.findByFavoriteFact(favoriteFact);
        if (favoriteFactToAddOpt.isPresent()) {
            Optional<Planets> planetToAddFavoriteFactToOpt = planetsRepo.findById(id);
            Planets planetToAddFavoriteFactTo = planetToAddFavoriteFactToOpt.get();
            planetToAddFavoriteFactTo.addFavoriteFact(favoriteFactToAddOpt.get());
            planetsRepo.save(planetToAddFavoriteFactTo);
        }

        return planetsRepo.findById(id);
    }

}

