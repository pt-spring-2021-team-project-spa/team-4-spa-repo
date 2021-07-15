package org.wecancodeit.mysteryeducator.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Planets {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Lob
    private String description;
    private String distance;
    private String size;
    @OneToOne
    private History history;
    @OneToOne
    private Art art;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDistance() {
        return distance;
    }

    public String getSize() {
        return size;
    }

    public History getHistory() {return history;}

    public Art getArt() {return art;}


    public Planets() {

    }

    public Planets(String name, String description, String distance, String size, History history, Art art) {
        this.name = name;
        this.description = description;
        this.distance = distance;
        this.size = size;
        this.history = history;
        this.art = art;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planets planets = (Planets) o;
        return Objects.equals(id, planets.id) && Objects.equals(name, planets.name) && Objects.equals(description, planets.description) && Objects.equals(distance, planets.distance) && Objects.equals(size, planets.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, distance, size);
    }

}
