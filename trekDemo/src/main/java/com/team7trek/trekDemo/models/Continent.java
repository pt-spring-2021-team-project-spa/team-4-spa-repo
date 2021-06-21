package com.team7trek.trekDemo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Continent {
    @Id
    @GeneratedValue
    private Long id;
    private String location;
    private String title;
    private String image;
    @OneToMany(mappedBy = "continent")
    private Collection<Region> regions;
    public Continent() {}
    public Continent(String location,String title,String image, Region... regions) {
        this.regions = new ArrayList<>(Arrays.asList(regions));
        this.title = title;
        this.image = image;
        this.location = location;
    }
    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }
    public Collection<Region> getRegions() {
        return regions;
    }
    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }


    public Continent() {}


    public Continent(String location,String image,String title) {
        this.title = title;
        this.image = image;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Collection<Trek> getTreks() {
        return treks;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(id, continent.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
