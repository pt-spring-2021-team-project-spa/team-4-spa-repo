package com.team7trek.trekDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private Long id;
    private String location;
    @OneToMany(mappedBy = "continent")
    private Collection<Trek> treks;

    public Long getId() {
        return id;
    }

    public Continent() {}


    public Continent(String location) {
        this.location = location;
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
