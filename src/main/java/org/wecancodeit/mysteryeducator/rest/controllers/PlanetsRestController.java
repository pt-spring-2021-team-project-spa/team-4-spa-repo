package org.wecancodeit.mysteryeducator.rest.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.mysteryeducator.models.Planets;
import org.wecancodeit.mysteryeducator.repositories.PlanetsRepository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class PlanetsRestController {
    @Resource
    private PlanetsRepository planetsRepo;

    @GetMapping("/api/planets")
    public Collection<Planets> getPlanets() {
        return (Collection<Planets>) planetsRepo.findAll();
    }

    @GetMapping("/api/planets/{id}")
    public Planets getPlanets(@PathVariable Long id) {
        return planetsRepo.findById(id).get();
    }

}
