package com.epam.training.anton_pashutkin.collections.model.factory;

class ClassicMusic extends Music implements Track{
    private static final String GENRE = "Classic";
    ClassicMusic(String artist, String title, int year, String album, int duration) {
        super(artist, title, year, album, GENRE, duration);
    }
}