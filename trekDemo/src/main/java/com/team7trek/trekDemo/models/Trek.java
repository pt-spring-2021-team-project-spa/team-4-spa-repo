package com.team7trek.trekDemo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Trek {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String difficulty;
    private String description;
    private String review;
    private String image;
    @ManyToOne
    private Continent continent;
    @ManyToOne
    private Region region;
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDifficulty() {
        return difficulty;
    }
    @Lob
    public String getDescription() {
        return description;
    }
    @Lob
    public String getReview() {
        return review;
    }
    public String getImage() {
        return image;
    }
    public Continent getContinent() {
        return continent;
    }
    public Region getRegions(){
        return region;
    }
    public Trek() {}
    public Trek(String title, String difficulty, String description, String review, String image, Continent continent, Region regions) {
        this.title = title;
        this.difficulty = difficulty;
        this.description = description;
        this.review = review;
        this.image = image;
        this.continent = continent;
        this.region = regions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trek trek = (Trek) o;
        return Objects.equals(id, trek.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
