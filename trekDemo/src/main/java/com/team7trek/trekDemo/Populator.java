package com.team7trek.trekDemo;

import com.team7trek.trekDemo.models.Continent;
import com.team7trek.trekDemo.models.Region;
import com.team7trek.trekDemo.models.Trek;
import com.team7trek.trekDemo.repositories.ContinentRepository;
import com.team7trek.trekDemo.repositories.RegionRepository;
import com.team7trek.trekDemo.repositories.TrekRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {
    @Resource
    private TrekRepository trekRepo;

    @Resource
    private ContinentRepository continentRepo;

    @Resource
    private RegionRepository regionRepo;

    @Override
    public void run(String... args) throws Exception {
        Continent northAmerica = new Continent("North America","img","title");
        Continent southAmerica = new Continent("South America","image","title");
        Continent europe = new Continent("Europe","image","title");
        Continent asia = new Continent("Asia","image","title");
        Continent antarctica = new Continent("Antarctica","image","title");
        Continent africa = new Continent("Africa","image","title");
        Continent australia = new Continent("Australia","image","title");
        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);
        continentRepo.save(europe);
        continentRepo.save(asia);
        continentRepo.save(antarctica);
        continentRepo.save(africa);
        continentRepo.save(australia);


        Region northAmerica1 = new Region("NorthAmerica","image","title");
        Region northAmerica2 = new Region("NorthAmerica","image","title");
        Region southAmerica2 = new Region("SouthAmerica","image","title");
        Region southAmerica1 = new Region("SouthAmerica","image","title");
        Region europe1 = new Region("europe","image","title");
        Region europe2 = new Region("europe","image","title");
        Region asia1 = new Region("asia", "image","title");
        Region asia2 = new Region("asia", "image","title");
        Region antarctica1 = new Region("ant","image","title");
        Region antarctica2 = new Region("ant","image","title");
        Region africa1 = new Region("Africa","images","title");
        Region africa2 = new Region("Africa","image","title");
        Region australia1 = new Region("australia","images","title");
        Region australia2 = new Region("australia","image","title");
        regionRepo.save(northAmerica1);
        regionRepo.save(northAmerica2);
        regionRepo.save(southAmerica1);
        regionRepo.save(southAmerica2);
        regionRepo.save(europe1);
        regionRepo.save(europe2);
        regionRepo.save(asia1);
        regionRepo.save(asia2);
        regionRepo.save(antarctica1);
        regionRepo.save(antarctica2);
        regionRepo.save(africa1);
        regionRepo.save(africa2);
        regionRepo.save(australia1);
        regionRepo.save(australia2);


        Trek na1 = new Trek("image","title","difficulty","description",northAmerica,"review",northAmerica1);
        Trek na2 = new Trek("image","title","difficulty","description",northAmerica,"review",northAmerica1);
        Trek na3 = new Trek("image","title","difficulty","description",northAmerica,"review",northAmerica2);
        Trek na4 = new Trek("image","title","difficulty","description",northAmerica,"review",northAmerica2);
        Trek sa1 = new Trek("image","title","difficulty","description",southAmerica,"review",southAmerica1);
        Trek sa2 = new Trek("image","title","difficulty","description",southAmerica,"review",southAmerica1);
        Trek sa3 = new Trek("image","title","difficulty","description",southAmerica,"review",southAmerica2);
        Trek sa4 = new Trek("image","title","difficulty","description",southAmerica,"review",southAmerica2);
        Trek e1 = new Trek("image","title","difficulty","description",europe,"review",europe1);
        Trek e2 = new Trek("image","title","difficulty","description",europe,"review",europe1);
        Trek e3 = new Trek("image","title","difficulty","description",europe,"review",europe2);
        Trek e4 = new Trek("image","title","difficulty","description",europe,"review",europe2);
        Trek a1 = new Trek("image","title","difficulty","description",asia,"review",asia1);
        Trek a2 = new Trek("image","title","difficulty","description",asia,"review",asia1);
        Trek a3 = new Trek("image","title","difficulty","description",asia,"review",asia2);
        Trek a4 = new Trek("image","title","difficulty","description",asia,"review",asia2);
        Trek ant1 = new Trek("image","title","difficulty","description",antarctica,"review",antarctica1);
        Trek ant2 = new Trek("image","title","difficulty","description",antarctica,"review",antarctica1);
        Trek ant3 = new Trek("image","title","difficulty","description",antarctica,"review",antarctica2);
        Trek ant4 = new Trek("image","title","difficulty","description",antarctica,"review",antarctica2);
        Trek af1 = new Trek("image","title","difficulty","description",africa,"review",africa1);
        Trek af2 = new Trek("image","title","difficulty","description",africa,"review",africa1);
        Trek af3 = new Trek("image","title","difficulty","description",africa,"review",africa1);
        Trek af4 = new Trek("image","title","difficulty","description",africa,"review",africa1);
        Trek aus1 = new Trek("image","title","difficulty","description",australia,"review",australia1);
        Trek aus2 = new Trek("image","title","difficulty","description",australia,"review",australia1);
        Trek aus3 = new Trek("image","title","difficulty","description",australia,"review",australia2);
        Trek aus4 = new Trek("image","title","difficulty","description",australia,"review",australia2);
        trekRepo.save(na1);
        trekRepo.save(na2);
        trekRepo.save(na3);
        trekRepo.save(na4);
        trekRepo.save(sa1);
        trekRepo.save(sa2);
        trekRepo.save(sa3);
        trekRepo.save(sa4);
        trekRepo.save(e1);
        trekRepo.save(e2);
        trekRepo.save(e3);
        trekRepo.save(e4);
        trekRepo.save(a1);
        trekRepo.save(a2);
        trekRepo.save(a3);
        trekRepo.save(a4);
        trekRepo.save(ant1);
        trekRepo.save(ant2);
        trekRepo.save(ant2);
        trekRepo.save(ant3);
        trekRepo.save(ant4);
        trekRepo.save(af1);
        trekRepo.save(af2);
        trekRepo.save(af3);
        trekRepo.save(af4);
        trekRepo.save(aus1);
        trekRepo.save(aus2);
        trekRepo.save(aus3);
        trekRepo.save(aus4);


    }

}
