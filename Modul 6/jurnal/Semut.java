package DriverJurnal06;

public class Semut extends Serangga {
    private Koordinat lokasiSarang;
    private Koordinat[] rute;
    private int jmlRute;

    public void setLokasiSarang(Koordinat lokasiSarang) {
        this.lokasiSarang = lokasiSarang;
        
    }

    public void setRute(Koordinat[] rute) {
        this.rute = rute;
        
    }

    public void setJmlRute(int jmlRute) {
        this.jmlRute = jmlRute;
    }

    public Koordinat getLokasiSarang() {
        return lokasiSarang;
    }

    public Koordinat[] getRute() {
        return rute;
    }

    public int getJmlRute() {
        return jmlRute;
    }
    
   public Semut(String Warna, int x, int y){
        super(Warna, x, y);
        this.lokasiSarang = new Koordinat(x, y);
        this.rute = new Koordinat[3];
        this.jmlRute = 0;
        
    }
    
    private void tambahRute(Koordinat a){
        if (rute[0] == null){
            rute[0] = a;
            jmlRute = jmlRute + 1;
        }else{
            int i = 1;
            while(rute[i] != null){
                i = i + 1;
            }
            rute[i]=a;
            jmlRute = jmlRute + 1;
        }
    }
    
    
    public void gerak(int x, int y){
    super.gerak(x,y);
    Koordinat Posisi = new Koordinat(x,y);
    tambahRute (Posisi);
    }
    
    public void KembaliKeSarang(){
        super.setPosisi(new Koordinat(lokasiSarang.getX(), lokasiSarang.getY()));
        this.rute = new Koordinat[3];
        this.jmlRute = 0;
    }
    
}
