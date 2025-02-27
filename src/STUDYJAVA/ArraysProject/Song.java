package STUDYJAVA.ArraysProject;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}

    class album {
    private String name;
    private String Artist;
    private LinkedList<Song> songs = new LinkedList<>();

        public album(String name, String artist) {
            this.name = name;
            Artist = artist;
        }


        private boolean addSong(String title, double duration) {
            Song newSong = new Song(title,duration);
            if (findSong(title) != null ) {
                System.out.println(newSong.getTitle() + " ja esta na lista. ");
                return false;
            }else{
                songs.add(newSong);
                return true;
            }
        }

        private  Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equalsIgnoreCase(title)) {
                    return song;
                }
            }

            return null;
        }
        public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
            if (trackNumber >= 1 && trackNumber <= songs.size()) {
                playlist.add(songs.get(trackNumber - 1));
                return  true;
            }
            return false;
            }
        }




