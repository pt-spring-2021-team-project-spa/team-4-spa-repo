package org.wecancodeit.mysteryeducator.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Entity
public class FavoriteFact {
    @Id
    @GeneratedValue
    private Long id;
    private String favoriteFact;
    @ManyToMany
    @JsonIgnore
    private Collection<Planets> planets;

    public FavoriteFact(String favoriteFact) {
        this.favoriteFact = favoriteFact;
        planets = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getFavoriteFact() {
        return favoriteFact;
    }

    public Collection<Planets> getPlanets() {
        return planets;
    }

 protected FavoriteFact() {

 }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FavoriteFact)) return false;
        FavoriteFact that = (FavoriteFact) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getFavoriteFact(), that.getFavoriteFact()) && Objects.equals(planets, that.planets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFavoriteFact(), planets);
    }
}
