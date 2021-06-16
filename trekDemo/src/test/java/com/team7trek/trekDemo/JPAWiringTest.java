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
        Continent testContinent = new Continent("Test Location","image","title");
        Continent testContinent2 = new Continent("Test Location2","image","title");
        Region testRegion1 = new Region("Test climate","image","title");
        Trek testTrek = new Trek("image", "title", "difficulty","description", testContinent, "Review", testRegion1);
        Trek testTrek2 = new Trek("image", "title", "difficulty","description", testContinent2, "Review", testRegion1);

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
}
