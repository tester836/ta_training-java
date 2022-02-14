package com.epam.training.anton_pashutkin.collections.fileProvider;

import com.epam.training.anton_pashutkin.collections.model.collection.*;
import com.epam.training.anton_pashutkin.collections.model.factory.*;
import java.io.*;
import java.util.Scanner;

public class FileProvider {

    public static Playlist ReadFromFile(String filename){
        Playlist playlist= Playlist.getInstance();
        try(Scanner scan=new Scanner(new File(filename))){
            String[] part;
            String choice;
            Track track;
            while (scan.hasNextLine() && scan.hasNext()){
                part = scan.nextLine().split(",");
                choice = part[4];
                switch (choice)
                {
                    case "Classic":
                        track = new ClassicTrackCreator().createNewTrack(
                                part[0],
                                part[1],
                                Integer.parseInt(part[2]),
                                part[3],
                                Integer.parseInt(part[5]));
                        break;

                    case "Soundtrack":
                        track =new SoundtrackTrackCreator().createNewTrack(
                                part[0],
                                part[1],
                                Integer.parseInt(part[2]),
                                part[3],
                                Integer.parseInt(part[5]));
                        break;

                    case "Folk":
                        track =new FolkTrackCreator().createNewTrack(
                                part[0],
                                part[1],
                                Integer.parseInt(part[2]),
                                part[3],
                                Integer.parseInt(part[5]));
                        break;

                    case "R&B":
                        track =new RnbTrackCreator().createNewTrack(
                                part[0],
                                part[1],
                                Integer.parseInt(part[2]),
                                part[3],
                                Integer.parseInt(part[5]));
                        break;

                    case "Rock":
                    default:
                        track =new RockTrackCreator().createNewTrack(
                                part[0],
                                part[1],
                                Integer.parseInt(part[2]),
                                part[3],
                                Integer.parseInt(part[5]));
                }

                if(!playlist.contains(track))
                    playlist.add(track);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return playlist;
    }

    public static void WriteToDisc(Disk disc, String dir){
        String discName = dir + disc.getName() + ".txt";
        try(FileWriter writer = new FileWriter(discName,false)) {

            for (Track track : disc){
                writer.write("\n"+track.writeToFile());
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void WriteToPlaylist(Track track, String filename){

        try(FileWriter writer = new FileWriter(filename,true)) {
            Scanner scan=new Scanner(new File(filename));
            if(scan.hasNext())
                writer.write("\n"+track.writeToFile());
            else
                writer.write(track.writeToFile());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}

