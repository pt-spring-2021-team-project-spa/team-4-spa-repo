package com.team7trek.trekDemo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;
    private String climate;
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
