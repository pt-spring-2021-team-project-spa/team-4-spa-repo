package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Objects;

@Entity
public class History {

    @Id
    @GeneratedValue
    private Long id;
    @Lob
    private String bio;
    @Lob
    private String synapse;

    public Long getId() {
        return id;
    }

    public String getBio() {
        return bio;
    }

    public String getSynapse() {
        return synapse;
    }

    public History() {

    }

    public History(Long id, String bio, String synapse) {
        this.id = id;
        this.bio = bio;
        this.synapse = synapse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        History history = (History) o;
        return Objects.equals(id, history.id) && Objects.equals(bio, history.bio) && Objects.equals(synapse, history.synapse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bio, synapse);
    }
}
