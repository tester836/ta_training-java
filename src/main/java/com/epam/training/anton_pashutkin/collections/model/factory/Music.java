package com.epam.training.anton_pashutkin.collections.model.factory;

public class Music implements Comparable<Track> {
    private String artist;
    private String title;
    private int year;
    private String album;
    private String genre;
    private int duration;

    @Override
    public int compareTo(Track o) {
        return 0;
    }

    public int compareTo(Music o){
        if(artist.compareTo(o.artist)==0)

        return album.compareTo(o.album);
        return artist.compareTo(o.artist);
    }

    public Music(
            String artist,
            String title,
            int year,
            String album,
            String genre,
            int duration) {
        if (title==null && artist==null && album==null && duration <= 0) {
            throw new IllegalArgumentException("not valid input");
        }

        this.artist = artist;
        this.title = title;
        this.year = year;
        this.album = album;
        this.genre = genre;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }

    public String getAlbum() {
        return album;
    }
    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return
            "Artist: " + this.getArtist() + " , " +
            "Title: " + this.getTitle() +" , " +
            "Year: " + this.getYear() + " , " +
            "Album: " + this.getAlbum() + " , " +
            "Genre: "+this.getGenre() + " , " +
            "Duration: "+this.getDuration() + " \n\r";
    }

    public String writeToFile() {
        return
            this.getArtist() + "," +
            this.getTitle() +"," +
            this.getYear() + "," +
            this.getAlbum() +"," +
            this.getGenre() + "," +
            this.getDuration() + "\r";
    }
}