package com.epam.training.anton_pashutkin.collections.model.factory;

public class RockMusic  extends Music implements Track{
    private static final String GENRE = "Rock";
    RockMusic(String artist, String title, int year, String album, int duration) {
        super(artist, title, year, album, GENRE, duration);
    }
}