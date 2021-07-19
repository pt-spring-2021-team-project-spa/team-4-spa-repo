package org.wecancodeit.mysteryeducator.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Art {
    @Id
    @GeneratedValue
    private Long id;
    private String apiLink;
    @Lob
    private String artworkBio;
    @ManyToMany
    @JsonIgnore
    private Collection<Planets> planets;

    public Art() {

    }

    public Art(String apiLink, String artworkBio, Planets...planets) {
        this.apiLink = apiLink;
        this.artworkBio = artworkBio;
        this.planets = new ArrayList<>(Arrays.asList(planets));
    }


    public Long getId() {
        return id;
    }

    public String getApiLinkt() {
        return apiLink;
    }

    public String getArtworkBio() {
        return artworkBio;
    }

    public Collection<Planets> getPlanets() {
        return planets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Art art = (Art) o;
        return Objects.equals(id, art.id) && Objects.equals(apiLink, art.apiLink) && Objects.equals(artworkBio, art.artworkBio) && Objects.equals(planets, art.planets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apiLink, artworkBio, planets);
    }
}











