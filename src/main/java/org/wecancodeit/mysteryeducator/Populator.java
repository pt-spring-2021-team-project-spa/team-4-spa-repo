package org.wecancodeit.mysteryeducator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.mysteryeducator.models.Planets;
import org.wecancodeit.mysteryeducator.repositories.ArtRepository;
import org.wecancodeit.mysteryeducator.repositories.HistoryRepository;
import org.wecancodeit.mysteryeducator.repositories.PlanetsRepository;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private PlanetsRepository planetRepo;
    @Resource
    private HistoryRepository historyRepo;
    @Resource
    private ArtRepository artRepo;

    @Override
    public void run(String... args) throws Exception {

    }
}
