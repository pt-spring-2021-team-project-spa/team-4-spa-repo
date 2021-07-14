package org.wecancodeit.mysteryeducator.rest.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.mysteryeducator.models.HashTag;
import org.wecancodeit.mysteryeducator.models.Planet;
import org.wecancodeit.mysteryeducator.repositories.HashTagRepository;
import org.wecancodeit.mysteryeducator.repositories.PlanetRepository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class PlanetRestController {

    @Resource
    private PlanetRepository planetRepo;

    @Resource
    private HashTagRepository hashTagRepo;

    @GetMapping("/api/planets")
    public Collection<Planet> getPlanets() {
        return (Collection<Planet>) planetRepo.findAll();
    }

    @GetMapping("/api/planets/{id}")
    public Optional<Planet> getPlanet(@PathVariable Long id) {
        return planetRepo.findById(id);
    }

    @PostMapping("/api/planets/{id}/add-hashtag")
    public Optional<Planet> addHashTagToPlanet(@RequestBody String body, @PathVariable Long id) throws JSONException {
        JSONObject newHashTag = new JSONObject(body);
        String hashTagName = newHashTag.getString("hashTagName");
        Optional<HashTag> hashTagToAddOpt = hashTagRepo.findByName(hashTagName);

        if (hashTagToAddOpt.isPresent()) {
            Optional<Planet> planetToAddHashTagToOpt = planetToAddHashTagToOpt.get();
            Planet planetToAddHashTagTo = planetToAddHashTagToOpt.get();
            planetToAddHashTagTo.addHashTag(hashTagToAddOpt.get());
            planetRepo.save(planetToAddHashTagTo);
        }

        return planetRepo.findById(id);
    }
}