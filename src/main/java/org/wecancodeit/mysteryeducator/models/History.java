package org.wecancodeit.mysteryeducator.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class History {

    @Id
    @GeneratedValue
    private Long id;
    @Lob
    private String bio;
    @Lob
    private String synopsis;
    @ManyToMany
    @JsonIgnore
    private Collection<Planets> planets;


    public Long getId() {
        return id;
    }

    public String getBio() {
        return bio;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public Collection<Planets> getPlanets() {
        return planets;
    }

    public History() {

    }


    public History(String bio, String synopsis, Planets...planets) {
        this.bio = bio;
        this.synopsis = synopsis;
        this.planets = new ArrayList<>(Arrays.asList(planets));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        History history = (History) o;
        return Objects.equals(id, history.id) && Objects.equals(bio, history.bio) && Objects.equals(synopsis, history.synopsis) && Objects.equals(planets, history.planets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bio, synopsis, planets);
    }
}