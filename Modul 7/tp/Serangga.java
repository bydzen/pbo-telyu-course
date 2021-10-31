package TP07;

public class Serangga {
    private final int jmlKaki = 6;
    private String warna;
        
    public Serangga(String warna) {
        this.warna = warna;
    }
    
    public void gerak(int[] gerakSerangga) {}
    
    public int getJmlKaki() {
        return jmlKaki;
    }

    public String getWarna() {
        return warna;
    }
    
    public void info() {}
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
}
