package com.team7trek.trekDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JPAWiringTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ContinentRepository continentRepo;
    @Autowired
    private RegionRepository regionRepo;
    @Autowired
    private TrekRepository trekRepo;

    @Test
    public void ContinentShouldHaveAListTreks() {
        Continent testContinent = new Continent("Test Location");
        Region testRegion1 = new Region("Test climate");
        Trek testTrek = new Trek("Title", "Difficulty", "Description", testContinent, "Review", testRegion1);

        continentRepo.save(testContinent);
        regionRepo.save(testRegion1);
        trekRepo.save(testTrek);

        entityManager.flush();
        entityManager.clear();

        Optional<Continent> retrievedContinentOpt = continentRepo.findById(testContinent.getId());
        Continent retrievedContinent = retrievedContinentOpt.get();
        Trek retrievedTrek = trekRepo.findById(testTrek.getId()).get();
        assertThat(retrievedContinent.getTreks()).contains(testTrek);
    }
}
