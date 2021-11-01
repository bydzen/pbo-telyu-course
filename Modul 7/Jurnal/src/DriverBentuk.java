package Jurnal07;

public class DriverBentuk {
    
    public static void main(String[] args) {
        Kubus K = new Kubus("Klub", 5);
        Lingkaran L = new Lingkaran("Sirkel", 14);
        PersegiPanjang PP = new PersegiPanjang("Rektenggel", 8, 9);
        PrismaSegi3 PS3 = new PrismaSegi3("Traienggel Prism", 6, 7, 10);

        L.info();
        System.out.println("Luas                    : " + L.hitungLuas());
        System.out.println("Keliling                : " + L.hitungKeliling());
        
        System.out.println("---");
        
        PP.info();
        /*
            Notice: Perhitungan luas dan keliling PersegiPanjang menggunakan
                    object L/Lingkaran (pada soal jurnal).
                    Mungkin yang dimaksud object PP/PersegiPanjang.
        */
        System.out.println("Luas                    : " + PP.hitungLuas());
        System.out.println("Keliling                : " + PP.hitungKeliling());
        
        System.out.println("---");
        
        K.info();
        System.out.println("Luas Permukaan          : " + K.hitungLuasPermukaan());
        System.out.println("Volume                  : " + K.hitungVolume());
        
        System.out.println("---");
        
        PS3.info();
        System.out.println("Luas Permukaan          : " + PS3.hitungLuasPermukaan());
        System.out.println("Volume                  : " + PS3.hitungVolume());
    }
}
