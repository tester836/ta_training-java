package com.epam.training.anton_pashutkin.collections.model.factory;

public class ClassicTrackCreator extends Creator{
    @Override
    public Track createNewTrack (String artist, String title, int year, String album, int duration) {
        return new ClassicMusic(artist, title, year, album, duration);
    }
}
