package Jurnal08;

public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi, String nama) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    @Override
    public double hitungKeliling() {
        return Math.round(3 * alas + (0.5 * tinggi));
    }
    
    @Override
    public double hitungLuas() {
        return Math.round(0.5 * alas * tinggi);
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
}
