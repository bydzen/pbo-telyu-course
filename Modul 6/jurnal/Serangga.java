package DriverJurnal06;

public class Serangga {
    private int JmlKaki = 6;
    private String Warna;
    private Koordinat posisi;
    
    public void setJmlKaki(int JmlKaki) {
        this.JmlKaki = JmlKaki;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public void setPosisi(Koordinat posisi) {
        this.posisi = posisi;
    }

    public int getJmlKaki() {
        return JmlKaki;
    }

    public String getWarna() {
        return Warna;
    }

    public Koordinat getPosisi() {
        return posisi;
    }
    
    public Serangga(String Warna, int x, int y){
        this.Warna = Warna;
        this.posisi = new Koordinat(x,y);
    }
    
    public void gerak(int x, int y){
     this.posisi = new Koordinat(x,y);
     
    }
}
