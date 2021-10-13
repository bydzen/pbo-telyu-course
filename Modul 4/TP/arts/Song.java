package arts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import jobs.Artist;

public class Song {
    String title;
    artist Artist;
    Date release;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(artist Artist) {
        this.Artist = Artist;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public String getTitle() {
        return title;
    }

    public artist getArtist() {
        return Artist;
    }

    public String getRelease() {
        //Date release to String sRelease using DateFormat (df)
        String _release = "YYYY-MM-DD";
        
        DateFormat df = new SimpleDateFormat(_release);
        String sRelease = df.format(release);
        
        return sRelease;
    }
    
    public String displayInfo(String title, String artist, String sRelease) {
        int age = jobs.Artist.getAge();
        
        return "Title: " + getTitle() + "\nArtist: " + getArtist() + "\nRelease: " + getRelease() + "\nArtist age is " + age + " when song released.";
    }

    private static class artist {

        public artist() {
            
        }
    }    
 
    
}
