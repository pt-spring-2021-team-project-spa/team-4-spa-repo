package org.wecancodeit.mysteryeducator.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.mysteryeducator.models.Art;
import org.wecancodeit.mysteryeducator.repositories.ArtRepository;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
public class ArtRestController {

    @Resource
    private ArtRepository artRepo;

    @GetMapping("/api/arts")
    public Collection<Art> getArtForms() {
        return (Collection<Art>) artRepo.findAll();
    }

    @GetMapping("/api/arts/{artId}")
    public Art getArt(@PathVariable Long artId) {
        return artRepo.findById(artId).get();
    }
}