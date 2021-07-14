package org.wecancodeit.mysteryeducator.rest.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.mysteryeducator.models.HashTag;
import org.wecancodeit.mysteryeducator.repositories.HashTagRepository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class HashTagRestController {

    @Resource
    private HashTagRepository hashTagRepo;

    @GetMapping("/api/hashtags")
    public Collection<HashTag> getHashTags() {
        return (Collection<HashTag>) hashTagRepo.findAll();
    }

    @PostMapping("/api/add-hashtag")
    public Collection<HashTag> addHashTag(@RequestBody String body) throws JSONException {
        JSONObject newHashTag= new JSONObject(body);
        String hashTagName = newHashTag.getString("hashTagName");
        Optional<HashTag> hashTagToAddOpt = hashTagRepo.findByName(hashTagName);

        if (hashTagToAddOpt.isEmpty()) {
            HashTag hashTagToAdd = new HashTag(hashTagName);
            hashTagRepo.save(hashTagToAdd);
        }

        return (Collection<HashTag>) hashTagRepo.findAll();
    }
}