package Jurnal07;

public class PersegiPanjang extends Bentuk implements BangunDatar {
    private int lebar;
    private int panjang;
    
    public PersegiPanjang(String nama, int panjang, int lebar) {
        super(nama);
        this.lebar = lebar;
        this.panjang = panjang;
    }
    
    @Override
    public double hitungKeliling() {
        return Math.round(2 * (lebar + panjang));
    }
    
    @Override
    public double hitungLuas() {
        return Math.round(panjang * lebar);
    }
    
    @Override
    public void info() {
        System.out.println("Nama Persegi Panjang    : " + this.getNama());
        System.out.println("Panjang                 : " + panjang);
        System.out.println("Lebar                   : " + lebar);
    }
}
