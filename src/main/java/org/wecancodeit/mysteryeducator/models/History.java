package org.wecancodeit.mysteryeducator.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.*;
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


    public Long getId() {
        return id;
    }

    public String getBio() {
        return bio;
    }


    public String getSynopsis() {
        return synopsis;
    }
  
    public History() {

    }


    public History(String bio, String synopsis) {
        this.bio = bio;
        this.synopsis = synopsis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        History history = (History) o;

        return Objects.equals(id, history.id) && Objects.equals(bio, history.bio) && Objects.equals(synopsis, history.synopsis);

    }

    @Override
    public int hashCode() {

        return Objects.hash(id, bio, synopsis);

    }
}
