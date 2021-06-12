package com.team7trek.trekDemo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Trek {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String difficulty;
    private String description;
    private String review;
    @ManyToOne
    private Continent continent;
    @ManyToMany
    private Collection<Region> regions;

    public Long getId() {
    return id;
}
    public Trek() {

    }

    public Trek(String title, String difficulty, String description, Continent continent, String review, Region...regions) {
        this.title = title;
        this.description = description;
        this.difficulty = difficulty;
        this.continent = continent;
        this.review = review;
        this.regions = new ArrayList<>(Arrays.asList(regions));
    }

}
