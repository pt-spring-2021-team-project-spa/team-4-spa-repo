package org.wecancodeit.mysteryeducator.models;

import javax.persistence.Entity;

@Entity
public class Art {
    private Long id;
    private String artist;
    private String artworkTitle;

    public Long getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getArtworkTitle() {
        return artworkTitle;
    }

    public Art() {

    }

    public Art(Long id, String artist, String artworkTitle) {
        this.id = id;
        this.artist = artist;
        this.artworkTitle = artworkTitle;
    }
}
