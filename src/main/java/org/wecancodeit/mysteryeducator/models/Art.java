package org.wecancodeit.mysteryeducator.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Art {
    @Id
    @GeneratedValue
    private Long id;
    private String apiLink;
    @Lob
    private String artworkBio;

    public Long getId() {
        return id;
    }
  
    public String getApiLinkt() {
        return apiLink;
    }

    public String getArtworkBio() {
        return artworkBio;
    }

    public Art() {

    }

    public Art(String apiLink, String artworkBio) {
        this.apiLink = apiLink;
        this.artworkBio = artworkBio;
    }
}
