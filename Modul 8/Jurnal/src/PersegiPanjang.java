package Jurnal08;

public class PersegiPanjang extends BangunDatar {
    private int lebar;
    private int panjang;

    public PersegiPanjang(int lebar, int panjang, String nama) {
        super(nama);
        this.lebar = lebar;
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getPanjang() {
        return panjang;
    }
    
    @Override
    public double hitungKeliling() {
        return Math.round(2 * (lebar + panjang));
    }
    
    @Override
    public double hitungLuas() {
        return Math.round(panjang * lebar);
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    
}
