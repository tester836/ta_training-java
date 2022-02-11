package com.epam.training.anton_pashutkin.collections;

import com.epam.training.anton_pashutkin.collections.controller.*;
import com.epam.training.anton_pashutkin.collections.model.collection.*;
import java.util.Scanner;

public class Audiorecording {
    private static final String filename = "Audiotracks.txt";
    private static final String diskDir="D://VirtualCD";

    public static void main(String[] args) {
        Playlist playlist;
        Scanner scanner=new Scanner(System.in);
        Disk disc = Disk.getInstance();
        boolean out=true;

        while(out){

            System.out.println(
                    "\nAvailable options: \n\nshow playlist, \nshow disk," +
                    "\ncreate disk, \nadd track to playlist, \nadd track to disk," +
                    "\ndisk sorting, \ndisk duration, \ntrack search , \nsave disk");

            String choice = scanner.nextLine();

            switch (choice){

                case "show playlist":
                    playlist =FileProvider.ReadFromFile(filename);
                    System.out.println("Playlist");
                    System.out.println(playlist);
                    break;

                case "show disk":
                    System.out.println("Disk: "+disc.getName());
                    System.out.println(disc);
                    break;

                case "create disk":
                    Controller.CreateDisk();
                    System.out.println("Done! \r\nDisk: \r\n"+disc.getName());
                    System.out.println(disc);
                    break;

                case "add track to playlist":
                    Controller.AddTrackToPlaylist(filename);
                    break;

                case "add track to disk":
                    disc = Disk.getInstance();
                    Controller.AddTrackToDisk(disc,filename,diskDir);
                    break;

                case "disk sorting":
                    disc = Disk.getInstance();
                    Controller.DiskSort(disc);
                    break;

                case "track search":
                    Controller.FindTrack(filename);
                    break;

                case "save disk":
                    Controller.SaveDisk(disc,diskDir);
                    break;

                case "disk duration":
                    Controller.SaveDisk(disc,filename);
                    Controller.CalculateDiskDuration(disc);
                    break;

                case "exit":
                    out=false;
                    break;

                default:
                    System.out.println("No such option, choose another.");
            }
        }
    }
}
