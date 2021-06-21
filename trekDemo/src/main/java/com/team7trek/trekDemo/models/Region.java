package com.team7trek.trekDemo.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Region {
    @Id
    @GeneratedValue
    private Long id;
    private String climate;

    @ManyToOne
    private Continent continent;
    @OneToMany(mappedBy = "region")
    private Collection<Trek> treks;
    public Region(){}
    public Region(String title, String image, String climate,Continent continent,Trek... treks) {
        this.continent = continent;
        this.treks = new ArrayList<>(Arrays.asList(treks));
        this.title = title;
        this.image = image;
        this.climate = climate;
    }

    private String image;
    private String title;
    public Region () {

    }


    public Long getId() {
        return id;
    }

    public String getClimate() {
        return climate;
    }

    public Collection<Trek> getTreks(){
        return treks;
    }
    public Continent getContinent() {
        return continent;
}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(id, region.id);


    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;

    }

    public Region(String climate, String image, String title) {
        this.climate = climate;
        this.image = image;
        this.title = title;
    }
}
