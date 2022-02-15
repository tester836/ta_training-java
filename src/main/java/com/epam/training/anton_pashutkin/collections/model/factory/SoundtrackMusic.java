package com.epam.training.anton_pashutkin.collections.model.factory;

public class SoundtrackMusic  extends Music implements Track{
    private static final String GENRE="Soundtrack";
    SoundtrackMusic(String artist, String title, int year, String album, int duration) {
        super(artist, title, year, album, GENRE, duration);
    }
}