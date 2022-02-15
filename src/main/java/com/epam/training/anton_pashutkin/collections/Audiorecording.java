package com.epam.training.anton_pashutkin.collections;

import com.epam.training.anton_pashutkin.collections.controller.*;
import com.epam.training.anton_pashutkin.collections.fileProvider.FileProvider;
import com.epam.training.anton_pashutkin.collections.model.collection.*;
import java.util.Scanner;

public class Audiorecording {
    private static final String filename = "data/Audiotracks.txt";
    private static final String diskDir="D://VirtualCD/";

    public static void main(String[] args) {
        Playlist playlist;
        Scanner scanner=new Scanner(System.in);
        Disk disc = Disk.getInstance();
        boolean out=true;

        while(out){

            System.out.println(
                    "\nAvailable options: \n\n1-show playlist, \n2-show disk," +
                    "\n3-create disk, \n4-add track to playlist, \n5-add track to disk," +
                    "\n6-disk sorting, \n7-track search, \n8-disk duration, \n9-save disk, \n10-exit.\n");

            String choice = scanner.nextLine();

            switch (choice){

                case "1": case "show playlist":
                    playlist = FileProvider.ReadFromFile(filename);
                    System.out.println("Playlist");
                    System.out.println(playlist);
                    break;

                case "2": case "show disk":
                    System.out.println("Disk: "+disc.getName());
                    System.out.println(disc);
                    break;

                case "3": case "create disk":
                    Controller.CreateDisk();
                    System.out.println("Done! \r\nDisk: \r\n"+disc.getName());
                    System.out.println(disc);
                    break;

                case "4": case "add track to playlist":
                    Controller.AddTrackToPlaylist (filename);
                    break;

                case "5": case "add track to disk":
                    disc = Disk.getInstance();
                    Controller.AddTrackToDisk (disc, filename, diskDir);
                    break;

                case "6": case "disk sorting":
                    disc = Disk.getInstance();
                    Controller.DiskSort(disc);
                    break;

                case "7": case "track search":
                    Controller.FindTrack (filename);
                    break;

                case "8": case "disk duration":
                    Controller.SaveDisk (disc, filename);
                    Controller.CalculateDiskDuration (disc);
                    break;

                case "9": case "save disk":
                    Controller.SaveDisk (disc, diskDir);
                    break;

                case "10": case "exit":
                    out=false;
                    break;

                default:
                    System.out.println("No such option, choose another.");
            }
        }
    }
}