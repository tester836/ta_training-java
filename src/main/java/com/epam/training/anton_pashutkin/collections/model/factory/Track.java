package com.epam.training.anton_pashutkin.collections.model.factory;

public interface Track {
    String writeToFile();
    String getArtist();
    String getTitle();
    int getYear();
    String getAlbum();
    String getGenre();
    int getDuration();
}
