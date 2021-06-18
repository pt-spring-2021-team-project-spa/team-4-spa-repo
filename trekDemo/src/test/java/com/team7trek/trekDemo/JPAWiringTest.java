package com.team7trek.trekDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class JPAWiringTest  {

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void continentShouldHaveAListOfTreks() {
        Continent testContinent = new Continent("Test Location");
        Region testRegion = new Region("Test title","Test image","Test climate");
        Trek testTrek = new Trek("Test title","Test difficulty","Test description","Test review","Test image", testContinent,testRegion);

    }
}
