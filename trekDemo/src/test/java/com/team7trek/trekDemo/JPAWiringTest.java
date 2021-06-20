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
    public void continentShouldHaveAListOfRegions() {
        Continent testContinent = new Continent("Test Location","title","image");
        Continent testContinent2 = new Continent("Test Location2","title","image");
        Region testRegion1 = new Region("Test title","Test image","Test climate",testContinent);
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
        assertThat(retrievedContinent.getRegions()).contains(testRegion1);
    }
    @Test
    public void regionsShouldHaveMultipleTreks() {
        Continent testContinent = new Continent("Test Location","title","image");
        Continent testContinent2 = new Continent("Test Location2","title","image");
        Region testRegion1 = new Region("Test title","Test image","Test climate",testContinent);
        Trek testTrek1 = new Trek("Test title","Test difficulty","Test description","Test review","Test image", testContinent,testRegion1);
        Trek testTrek2 = new Trek("Test title","Test difficulty","Test description","Test review","Test image", testContinent2,testRegion1);
        continentRepo.save(testContinent);
        continentRepo.save(testContinent2);
        regionRepo.save(testRegion1);
        trekRepo.save(testTrek1);
        trekRepo.save(testTrek2);
        entityManager.flush();
        entityManager.clear();
        Region retrievedRegion = regionRepo.findById(testRegion1.getId()).get();
        Trek retrievedTrek1 = trekRepo.findById(testTrek1.getId()).get();
        Trek retrievedTrek2 = trekRepo.findById(testTrek2.getId()).get();
        assertThat(retrievedRegion.getTreks()).contains(testTrek1,testTrek2);
    }
}