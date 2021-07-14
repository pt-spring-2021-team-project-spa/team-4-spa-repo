package org.wecancodeit.mysteryeducator.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Art {

    @Id
    @GeneratedValue
    private Long id;
    private String music;
    private String painting;

    @ManyToOne
    private Collection<Planet> planets;

    public Long getId() {
        return id;
    }

    public String getMusic() {
        return music;
    }

    public String getPainting() {
        return painting;
    }

    public Art(Long id, String music, String painting) {
        this.id = id;
        this.music = music;
        this.painting = painting;
    }

}

