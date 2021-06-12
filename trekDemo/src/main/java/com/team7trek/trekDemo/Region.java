package com.team7trek.trekDemo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;
    private String climate;


    public Region(String climate) {
        this.climate = climate;
    }
}
