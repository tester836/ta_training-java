package com.epam.training.anton_pashutkin.collections.model.factory;

public class FolkTrackCreator extends Creator{
    @Override
    public Track createNewTrack (String artist, String title, int year, String album, int duration) {
        return new FolkMusic(artist, title, year, album, duration);
    }
}