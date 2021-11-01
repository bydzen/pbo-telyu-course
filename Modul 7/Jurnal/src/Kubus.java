package Jurnal07;

public class Kubus extends Bentuk implements BangunRuang {
    private int sisi;
    
    public Kubus(String nama, int sisi) {
        super(nama);
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return Math.round(6 * Math.pow(sisi, 2));
    }
    
    @Override
    public double hitungVolume() {
        return Math.round(Math.pow(sisi, 3));
    }
    
    @Override
    public void info() {
        System.out.println("Nama Kubus              : " + this.getNama());
        System.out.println("Panjang sisi            : " + sisi);
    }
}
