package com.team7trek.trekDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class JPAWiringTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ContinentRepository continentRepo;

    @Test
    public void ContinentShouldHaveAListTreks() {
        Continent testContinent = new Continent("Test Location");
        Region testRegion1 = new Region("Test climate");
        Trek testTrek = new Trek("Title", "Difficulty", "Description", testRegion1, testContinent, "Review");

        regionRepo.save(testRegion1);
    }
}
