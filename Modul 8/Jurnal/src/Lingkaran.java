package Jurnal08;

public class Lingkaran extends BangunDatar {
    private int jari_jari;

    public Lingkaran(int jari_jari, String nama) {
        super(nama);
        this.jari_jari = jari_jari;
    }

    public int getJari_jari() {
        return jari_jari;
    }
    
    @Override
    public double hitungKeliling() {
        return Math.round(2 * Math.PI * jari_jari);
    }
    
    @Override
    public double hitungLuas() {
        return Math.round(Math.PI * Math.pow(jari_jari, 2));
    }

    public void setJari_jari(int jari_jari) {
        this.jari_jari = jari_jari;
    }
    
}
