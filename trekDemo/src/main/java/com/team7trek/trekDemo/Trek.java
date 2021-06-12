package com.team7trek.trekDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Trek {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String difficulty;
    private String description;
    private Continent continent;
    private String review;
    private Collection<Region> regions;


    public Trek(String title, String difficulty, String description, Continent continent, String review, Region... regions) {
    }

    public Long getId() {
        return null;
    }
}
