package com.epam.training.anton_pashutkin.collections.model.collection;


import com.epam.training.anton_pashutkin.collections.model.factory.Track;
import java.util.ArrayList;

import static com.epam.training.anton_pashutkin.collections.controller.Controller.DurationInStandardView;

public class Playlist extends ArrayList<Track> {

    private static Playlist instance;

    private Playlist(){}

    public static Playlist getInstance()
    {
        Playlist localInstance = instance;
        if (localInstance==null) {
            synchronized (Playlist.class) {
                localInstance = instance;

                if (localInstance==null) {
                    instance = localInstance = new Playlist();
                }
            }
        }
        return localInstance;
    }

    public void print(){
        int i=1;
        for(Track track : this){
            System.out.println("#" + i + " " + track);
            i++;
        }
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
                            "Duration: " + DurationInStandardView(track.getDuration()) + " \n\r"
            );
        }
        return buffer.toString();
    }

    public int indexOf(String title) {

        for (int i=0; i<this.size();i++) {
            if (this.get(i).getTitle().contains(title))
                return i;
        }
        return -1;
    }

    public boolean contains(Track trackFind) {

        String find, artist;

        for (Track track: this){
            artist=track.getArtist();
            find=trackFind.getArtist();

            if (artist.equals(find)){
                return true;
            }
        }
        return false;
    }
}