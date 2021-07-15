package org.wecancodeit.mysteryeducator.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Planet {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Lob
    private String description;
    private String distance;
    private String size;

    @OneToMany(mappedBy = "planets")
    private Collection<Art> artForms;

    @OneToMany
    private Collection<History> historyInfo;

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

    public Planet() {

    }

    public Planet(Long id, String name, String description, String distance, String size) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.distance = distance;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Objects.equals(id, planet.id) && Objects.equals(name, planet.name) && Objects.equals(description, planet.description) && Objects.equals(distance, planet.distance) && Objects.equals(size, planet.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, distance, size);
    }
}
