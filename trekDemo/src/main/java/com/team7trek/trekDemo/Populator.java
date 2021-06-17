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


        Trek na1 = new Trek("killerkayaking.jpg","Killer Kayaking","2/5","Just north of Vancouver Island, BC hundreds of orca (killer) whales migrate. Telegraph Cove is a world renowned place for kayaking with the whales. You may also encounter other wildlife such as humpback whales, bears, sea lions, otters, porpoises, and eagles.",northAmerica,"Exhilarating and terrifying. There is something amazing about watching these huge masters of the ocean, but to be near them is to remind you how small a part of the world you are.  ",northAmerica1);
        Trek na2 = new Trek("costarica.jpg","Arenal Waterfall Repelling","4/5","Waterfall repelling or canyoning is one of Costa Rica's most thrilling adventure sports. This TREK involes a romp through a beautiful rainforest and a descent into crystalline water that will satisify even the biggest adrenaline junkies and leave you begging to do it all over again.",northAmerica,"Amazing once in a lifetime views and experiences. Challenging but worth it in the end.",northAmerica1);
        Trek na3 = new Trek("CopperCanyon.jpg","Copper Canyon","3/5","The longest (3km), highest (300 meters) and fastest (120 km per hour) zipline in the world is in the Copper Canyon Adventure Park (Parque de Aventuras) near Divisadero.This is part of a system of seven ziplines and two suspension bridges. Other optional activities at the park include a trip in a cable car and a Via Ferrata that allows you to scale and rappel the wall of the canyon. Enjoy the beauty of the canyon and get an adrenaline rush at the same time!",northAmerica,"The most wonderful and enchanted places you will ever visit! The people, views and food are awesome. Its a place difficult to get too, but well worth it. This place will defentebly will make you re-think your priorities. One of the places you should visit at least once in your lifetime.",northAmerica2);
        Trek na4 = new Trek("laketahoe.jpg","Mr.Toads Wild Ride","5/5","You may think this is a Disney ride by the name but you would be gravely mistaken. Mr.Toads Wild Ride is a single-track mountain bike route that is mostly downhill from Tahoe Rim Trail, Lake Tahoe. The total descent is over 2000 ft. The path itself is not for the faint of heart with steep drops, sections of nothing but rock, and large jumps.",northAmerica,"Amazing, definitely recommend but be forewarned this is not for beginners. I have years of offroad biking experience and there were several parts in the trail with between the speed and obsticle I was certain I was about to crash.",northAmerica2);
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
