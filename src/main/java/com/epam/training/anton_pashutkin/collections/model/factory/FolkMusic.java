package com.epam.training.anton_pashutkin.collections.model.factory;

class FolkMusic extends Music implements Track{
    private static final String GENRE = "Folk";
    FolkMusic(String artist, String title, int year, String album, int duration) {
        super(artist, title, year, album, GENRE, duration);
    }
}