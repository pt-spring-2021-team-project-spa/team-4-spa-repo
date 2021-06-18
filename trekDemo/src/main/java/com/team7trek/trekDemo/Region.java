package com.team7trek.trekDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String image;
    private String climate;


    public Region(){}
    public Region(String title, String image, String climate) {
        this.title = title;
        this.image = image;
        this.climate = climate;
    }
}
