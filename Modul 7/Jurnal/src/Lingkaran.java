package Jurnal07;

public class Lingkaran extends Bentuk implements BangunDatar {
    private int jari_jari;
    
    public Lingkaran(String nama, int jari_jari) {
        super(nama);
        this.jari_jari = jari_jari;
    }
    
    @Override
    public double hitungKeliling() {
        return Math.round(2 * Math.PI * jari_jari);
    }
    
    @Override
    public double hitungLuas() {
        return Math.round(Math.PI * Math.pow(jari_jari, 2));
    }
    
    @Override
    public void info() {
        System.out.println("Nama Lingkaran          : " + this.getNama());
        System.out.println("Panjang jari-jari       : " + jari_jari);
    }
}
