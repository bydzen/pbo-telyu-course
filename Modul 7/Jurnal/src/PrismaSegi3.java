package Jurnal07;

public class PrismaSegi3 extends Bentuk implements BangunRuang {
    private int alas;
    private int tinggi;
    private int tinggi_prisma;
    
    public PrismaSegi3(String nama, int alas, int tinggi, int tinggi_prisma) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggi_prisma = tinggi_prisma;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return Math.round(2 * (0.5 * alas * tinggi)) + ((alas * 3) * tinggi_prisma);
    }
    
    @Override
    public double hitungVolume() {
        return Math.round((0.5 * (alas * tinggi)) * tinggi_prisma);
    }
    
    @Override
    public void info() {
        System.out.println("Nama Prisma Segitiga    : " + this.getNama());
        System.out.println("Alas Segitiga           : " + alas);
        System.out.println("Tinggi Segitiga         : " + tinggi);
        System.out.println("Tinggi Prisma           : " + tinggi_prisma);
    }
}
