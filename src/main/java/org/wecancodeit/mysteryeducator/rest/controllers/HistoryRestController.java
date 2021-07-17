package org.wecancodeit.mysteryeducator.rest.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.mysteryeducator.models.Art;
import org.wecancodeit.mysteryeducator.models.History;
import org.wecancodeit.mysteryeducator.repositories.HistoryRepository;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
public class HistoryRestController {
    @Resource
    private HistoryRepository historyRepo;

    @GetMapping("/api/history")
    public Collection<History> getHistory() {
        return (Collection<History>) historyRepo.findAll();
    }

    @GetMapping("/api/history/{id}")
    public History getOneHistory(@PathVariable Long id) {
        return historyRepo.findById(id).get();
    }

}
