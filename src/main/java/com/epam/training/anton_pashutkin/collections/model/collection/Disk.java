package com.epam.training.anton_pashutkin.collections.model.collection;


import com.epam.training.anton_pashutkin.collections.model.factory.Track;
import java.util.ArrayList;

public class Disk extends ArrayList<Track> {

    private String name;
    private static Disk instance;

    private Disk(){}

    public static Disk getInstance(){
        Disk localInstance = instance;
        if (localInstance==null) {
            synchronized (Disk.class) {
                localInstance = instance;

                if (localInstance==null) {
                    instance = localInstance = new Disk();
                    localInstance.setName("Untitled");
                }
            }
        }
        return localInstance;
    }

    public static Disk getInstance(String name){
        Disk localInstance = instance;
        if(localInstance==null){
            synchronized (Disk.class){
                localInstance = instance;
                if(localInstance==null){
                    instance = localInstance = new Disk();
                    localInstance.setName(name);
                }
            }
        }
        localInstance.setName(name);
        return localInstance;
    }

    public void resetInstance(){
        instance = new Disk();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (Track track: this) {
            buffer.append(
                "Artist: " + track.getArtist() + ", " +
                "Title: " + track.getTitle() + ", " +
                "Year: " + track.getYear() + ", " +
                "Album: " + track.getAlbum() + ", " +
                "Genre: " + track.getGenre() + ", " +
                "Duration: " + track.getDuration() + " \n\r"
            );
        }
        return buffer.toString();
    }
}