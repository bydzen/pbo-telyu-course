package tp4_1303194010;

import java.util.Scanner;

public class DriverSong {
    static class AlbumSong {
        private String release;
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
        
        public String getRelease() {
            return release;
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
        song1.release = "1984-09-19";
        
        song2.artist = "Ed Sheeran";
        song2.release = "1991-02-17";
        
        System.out.println("------ Getter ------\n");
        System.out.println("song1 title=" + song1.getRelease() + ", artist=" + song1.getArtist() + " duration=" + song1.getDuration());
        System.out.println("song2 title=" + song2.getRelease() + ", artist=" + song2.getArtist() + " duration=" + song2.getDuration());
    }
}
