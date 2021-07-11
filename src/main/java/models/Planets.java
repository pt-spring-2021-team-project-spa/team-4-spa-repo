package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
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

    public Planets() {

    }

    public Planets(Long id, String name, String description, String distance, String size) {
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
        Planets planets = (Planets) o;
        return Objects.equals(id, planets.id) && Objects.equals(name, planets.name) && Objects.equals(description, planets.description) && Objects.equals(distance, planets.distance) && Objects.equals(size, planets.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, distance, size);
    }
}
