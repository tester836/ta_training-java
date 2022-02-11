package com.epam.training.anton_pashutkin.collections.model.factory;

abstract class Creator {
    public abstract Track createNewTrack(
            String artist,
            String title,
            int year,
            String album,
            int duration);
}