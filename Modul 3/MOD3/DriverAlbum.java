package pbo_1303194010_sultan.kautsar;

import java.util.*;

public class DriverAlbum {
    static class AlbumSong {
        private String title;
        private String artist;
        private int duration;

        public void setTitle(String title) {
            this.title = title;
        }
        
        public void setArtist(String artist) {
            this.artist = artist;
        }
        
        public void setDuration(int duration) {
            this.duration = duration;
        }
        
        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public int getDuration() {
            return duration;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AlbumSong song1 = new AlbumSong();
        AlbumSong song2 = new AlbumSong();
        
        song1.artist = "Budi Doremi";
        song1.title = "Melukis Senja";
        song1.duration = 240;
        
        song2.artist = "Ed Sheeran";
        song2.title = "Photograph";
        song2.duration = 240;
        
        System.out.println("------ Getter ------\n");
        System.out.println("song1 title=" + song1.getTitle() + ", artist=" + song1.getArtist() + " duration=" + song1.getDuration());
        System.out.println("song2 title=" + song2.getTitle() + ", artist=" + song2.getArtist() + " duration=" + song2.getDuration());
    }
}
