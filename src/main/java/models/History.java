package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

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

    public History(Long id, String bio, String synapse) {
        this.id = id;
        this.bio = bio;
        this.synapse = synapse;
    }
}
