package com.epam.training.anton_pashutkin.collections.model.factory;

public class RnbMusic extends Music implements Track{
    private static final String GENRE = "R&B";
    RnbMusic(String artist, String title, int year, String album, int duration) {
        super(artist, title, year, album, GENRE, duration);
    }
}
