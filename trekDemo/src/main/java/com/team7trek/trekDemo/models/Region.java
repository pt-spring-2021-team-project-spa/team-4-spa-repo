package com.team7trek.trekDemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String image;
    private String climate;
    @ManyToMany(mappedBy = "regions")
    private Collection<Trek> treks;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getClimate() {
        return climate;
    }

    public Collection<Trek> getTreks(){
        return treks;
    }

    public Region(){}
    public Region(String title, String image, String climate) {
        this.title = title;
        this.image = image;
        this.climate = climate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(id, region.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
