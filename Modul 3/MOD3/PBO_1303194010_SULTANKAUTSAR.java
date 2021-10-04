package pbo_1303194010_sultan.kautsar;

import java.util.*;

public class PBO_1303194010_SULTANKAUTSAR {

    public static class Song {
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
        
        public void play(String title, String artist, int duration) {
            this.title = title;
            this.artist = artist;
            this.duration = duration;
        }
    }
    
    public static class Album {
        private String title;
        private int year;
        private int track;
        private String[] songs;
        private String song;

        public void setTitle(String title) {
            this.title = title;
        }
        
        public void setYear(int year) {
            this.year = year;
        }
        
        public void setTotalSongs(int track) {
            this.track = track;
        }
        
        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }
        
        public void addSong(String songs) {
            this.song = song;
            System.out.println("Song: " + songs);
        }
        
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------ Input ------\n");
        Song s1 = new Song();
        
        System.out.print("Input Artist: ");
        String artist = sc.nextLine();
        
        // Kondisi jika inputan string kosong
        if (artist.length() <= 0 ) {
            throw new IllegalArgumentException();
        }
        
        System.out.print("Input Title: ");
        String title = sc.nextLine();
        
        // Kondisi jika inputan string kosong
        if (title.length() <= 0) {
            throw new IllegalArgumentException();
        }
        
        System.out.print("Input Duration: ");
        int duration = sc.nextInt();
        
        s1.artist = artist;
        s1.title = title;
        s1.duration = duration;
        
        System.out.println("\n\n------ Output ------\n");
        System.out.println("Judul: " + s1.getTitle());
        System.out.println("Artis: " + s1.getArtist());
        
        // Kondisi ubah int ke MM:SS
        int hours = s1.getDuration() / 60;
        int minutes = s1.getDuration() % 60;
        
        // Kondisi durasi
        if(s1.getDuration() < 120) {
            System.out.print("Durasi: " + s1.getDuration() + " (Short)");
        } else if(s1.getDuration() >= 120 && s1.getDuration() <= 240) {
            System.out.print("Durasi: " + s1.getDuration() + " (Intermediate)");
        } else {
            System.out.print("Durasi: " + s1.getDuration() + " (Long)");
        }
        
        System.out.printf(" // %02d:%02d Menit\n\n", hours, minutes);
        
        Album a1 = new Album();
        
        String[] listSong = { "Song A", "Song B", "Song C" };
        
        for(int i = 0; i < listSong.length; i++) {
            a1.addSong(listSong[i]);
        }        
        
    }
    
}
