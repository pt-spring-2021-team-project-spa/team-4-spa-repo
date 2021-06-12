package com.team7trek.trekDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Continent {

    @Id
    @GeneratedValue


    public Continent(String test_location) {
    }

    public Long getId() {
        return null;
    }

    public Collection<Trek> getTreks() {
        return null;
    }
}
