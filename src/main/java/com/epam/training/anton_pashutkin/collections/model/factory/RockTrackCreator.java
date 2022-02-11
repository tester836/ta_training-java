package com.epam.training.anton_pashutkin.collections.model.factory;

public class RockTrackCreator extends Creator{
    @Override
    public Track createNewTrack (String artist, String title, int year, String album, int duration) {
        return new RockMusic(artist, title, year, album, duration);
    }
}