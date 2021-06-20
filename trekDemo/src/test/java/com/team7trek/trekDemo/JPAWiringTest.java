package com.team7trek.trekDemo;

import com.team7trek.trekDemo.models.Continent;
import com.team7trek.trekDemo.models.Region;
import com.team7trek.trekDemo.models.Trek;
import com.team7trek.trekDemo.repositories.ContinentRepository;
import com.team7trek.trekDemo.repositories.RegionRepository;
import com.team7trek.trekDemo.repositories.TrekRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
public class JPAWiringTest  {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ContinentRepository continentRepo;
    @Autowired
    private RegionRepository regionRepo;
    @Autowired
    private TrekRepository trekRepo;

    @Test
    public void continentShouldHaveAListOfTreks() {
        Continent testContinent = new Continent("Test Location");
        Continent testContinent2 = new Continent("Test Location2");
        Region testRegion1 = new Region("Test title","Test image","Test climate");
        Trek testTrek = new Trek("Test title","Test difficulty","Test description","Test review","Test image", testContinent,testRegion1);
        Trek testTrek2 = new Trek("Test title","Test difficulty","Test description","Test review","Test image", testContinent2,testRegion1);

        continentRepo.save(testContinent);
        continentRepo.save(testContinent2);
        regionRepo.save(testRegion1);
        trekRepo.save(testTrek);
        trekRepo.save(testTrek2);

        entityManager.flush();
        entityManager.clear();

        Optional<Continent> retrievedContinentOpt = continentRepo.findById(testContinent.getId());
        Continent retrievedContinent = retrievedContinentOpt.get();
        assertThat(retrievedContinent.getTreks()).contains(testTrek);
    }
    @Test
    public void treksShouldBeAbleToHaveMultipleRegions() {
        Continent testContinent = new Continent("Test Location");
        Region testRegion1 = new Region("Test title","Test image","Test climate");
        Region testRegion2 = new Region("Test title2","Test image2","Test climate2");
        Trek testTrek1 = new Trek("Test title","Test difficulty","Test description","Test review","Test image", testContinent,testRegion1, testRegion2);
        Trek testTrek2 = new Trek("Test title","Test difficulty","Test description","Test review","Test image", testContinent,testRegion1);
        Trek testTrek3 = new Trek("Test title","Test difficulty","Test description","Test review","Test image", testContinent,testRegion2);
        continentRepo.save(testContinent);
        regionRepo.save(testRegion1);
        regionRepo.save(testRegion2);
        trekRepo.save(testTrek1);
        trekRepo.save(testTrek2);
        trekRepo.save(testTrek3);

        entityManager.flush();
        entityManager.clear();

        Trek retrievedTrek = trekRepo.findById(testTrek1.getId()).get();
        Region retrievedRegion1 = regionRepo.findById(testRegion1.getId()).get();
        Region retrievedRegion2 = regionRepo.findById(testRegion2.getId()).get();
        assertThat(retrievedTrek.getRegions()).contains(testRegion1,testRegion2);
    }

    @Test
    public void continentShouldHaveAListOfRegions() {
        Continent testContinent = new Continent("Test Location");
        Region testRegion1 = new Region("Test title","Test image","Test climate");
        Region testRegion2 = new Region("Test title","Test image","Test climate");
        Trek testTrek1 = new Trek("Test title","Test difficulty","Test description","Test review","Test image", testContinent,testRegion1);
        continentRepo.save(testContinent);
        regionRepo.save(testRegion1);
        regionRepo.save(testRegion2);
        trekRepo.save(testTrek1);
        entityManager.flush();
        entityManager.clear();

        Optional<Continent> retrievedContinentOpt = continentRepo.findById(testContinent.getId());
        Continent retrievedContinent = retrievedContinentOpt.get();
        assertThat(retrievedContinent.getRegions()).contains(testRegion1, testRegion2);

    }
}
