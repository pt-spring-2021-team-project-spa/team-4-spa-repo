package com.team7trek.trekDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private Long id;
    private String location;

    public Long getId() {
        return id;
    }

    public Continent() {}


    public Continent(String location) {
        this.location = location;
    }


    public Collection<Trek> getTreks() {
        return null;
    }
}
