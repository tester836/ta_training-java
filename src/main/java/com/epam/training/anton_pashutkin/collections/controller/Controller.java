package com.epam.training.anton_pashutkin.collections.controller;

import com.epam.training.anton_pashutkin.collections.fileProvider.FileProvider;
import com.epam.training.anton_pashutkin.collections.model.collection.*;
import com.epam.training.anton_pashutkin.collections.model.factory.*;
import java.util.*;

public class Controller {

    private static String artist, title, album, genre;
    private static int year, duration;
    private static Scanner input = new Scanner(System.in);
    private static final String[] genres = {"Rock", "Classic", "Soundtrack","Folk", "R&B"};

    public static void AddTrackToPlaylist(String filename){

        System.out.println("Enter the artist:");
        artist=input.nextLine();
        while (artist.isEmpty()) {
            System.out.println("The value is invalid, enter again:");
            artist = input.nextLine();
        }

        System.out.println("Enter the track title:");
        title = input.nextLine();
        while (title.isEmpty()) {
            System.out.println("The value is invalid, enter again:");
            title = input.nextLine();
        }

        System.out.println("Enter the track album:");
        album = input.nextLine();
        while (album.isEmpty()) {
            System.out.println("The value is invalid, enter again:");
            album = input.nextLine();
        }

        System.out.println("Enter the year of track release:");
        year = input.nextInt();
        while (year <= 0) {
            System.out.println("The value is invalid, enter again:");
            year = input.nextInt();
        }

        System.out.println("Choose the genre from the list: Rock, Classic, Soundtrack, Folk, R&B");
        genre=input.next();
            while (!Arrays.asList(genres).contains(genre)) {
            System.out.println("Mistaken, enter the available genres from the list above.");
            genre=input.next();
            }

        System.out.println("Enter the track duration (in seconds):");
        duration = input.nextInt();
        while (duration <= 0) {
            System.out.println("The value is invalid, enter again:");
            duration = input.nextInt();
        }

        Track track;

        switch (genre) {

            case "Classic":
                track = new ClassicTrackCreator().createNewTrack(artist, title, year, album, duration);
                break;

            case "Soundtrack":
                track = new SoundtrackTrackCreator().createNewTrack(artist, title, year, album, duration);
                break;

            case "Folk":
                track = new FolkTrackCreator().createNewTrack(artist, title, year, album, duration);
                break;

            case "R&B":
                track = new RnbTrackCreator().createNewTrack(artist, title, year, album, duration);
                break;
            case "Rock":

            default:
                track = new RockTrackCreator().createNewTrack(artist, title, year, album, duration);
        }

        FileProvider.WriteToPlaylist(track,filename);
    }

    public static void AddTrackToDisk(Disk disc, String filename, String dir){

        if (!disc.isEmpty()||!disc.getName().equals("Untitled")){

            Playlist playlist =FileProvider.ReadFromFile(filename);
            playlist.print();
            System.out.println("Which track do you want to add?");
            int num=input.nextInt();
            while (num<=0||num>playlist.size()){
                System.out.println("Wrong track number, repeat please.  "+ playlist.size());
                num=input.nextInt();
            }
            disc.add(playlist.get(num-1));
            FileProvider.WriteToDisc(disc,dir);

        }
        else System.out.println("You need to create a disk.");


    }

    public static String DurationInStandardView (int diskDuration){
        int hours = diskDuration / 3600;
        int minutes = diskDuration % 3600 / 60;
        int seconds = (diskDuration % 3600) % 60;

        if (hours > 0) {
            return hours + "h:" + minutes + "m:" + seconds + "s ";
        } else if (minutes > 0) {
            return minutes + "m:" + seconds + "s ";
        } else {
            return seconds + "s ";
        }
    }


    //todo display duration in hours minutes seconds
    public static void CalculateDiskDuration(Disk disc){
        int diskDuration = 0;
        for (Track track: disc){
            diskDuration += track.getDuration();
        }

        System.out.println("Disk duration is: " + diskDuration);
    }

    public static void DiskSort(Disk disc){

        Collections.sort(disc, (Track o1, Track o2)->{
            if(o1.getArtist().compareTo(o2.getArtist())==0)
                return o1.getAlbum().compareTo(o2.getAlbum());
            return o1.getArtist().compareTo(o2.getArtist());
        });
    }

    public static void SaveDisk(Disk disc,String dir){
        if (!disc.isEmpty()){
            FileProvider.WriteToDisc(disc,dir);
            System.out.println("Done!");
            disc.resetInstance();
        }
        else System.out.println("Disk is empty.");
    }

    public static void FindTrack(String filename){
        Playlist playlist =FileProvider.ReadFromFile(filename);
        System.out.println("Enter the title to search:");

        int i=playlist.indexOf(input.next());
        if(i==-1)
            System.out.println("No result.");
        else
            System.out.println("Result:" + "\r\n" + "#" + i + "  " + playlist.get(i));
    }

    public static void CreateDisk(){
        System.out.println("Enter the disk title:");
        Disk disc = Disk.getInstance(input.nextLine());
        System.out.println("Disk:" + disc + "\r\n");
    }
}