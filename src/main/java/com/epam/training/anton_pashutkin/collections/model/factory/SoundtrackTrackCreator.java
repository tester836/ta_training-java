package com.epam.training.anton_pashutkin.collections.model.factory;

public class SoundtrackTrackCreator extends Creator{
    @Override
    public Track createNewTrack (String artist, String title, int year, String album, int duration) {
        return new SoundtrackMusic(artist, title, year, album, duration);
    }
}