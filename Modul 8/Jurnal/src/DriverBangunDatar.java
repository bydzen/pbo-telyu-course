package Jurnal08;

public class DriverBangunDatar {
    public static void main(String[] args) {
        BangunDatar BD[] = new BangunDatar[3];
        
        BD[0] = new Lingkaran(21, "Circle");
        BD[1] = new PersegiPanjang(15, 8, "Rectangle");
        BD[2] = new Segitiga(10, 12, "Triangle");
        
        for (BangunDatar BD1 : BD) {
            System.out.println("Nama BangunDatar : " + BD1.getNama());
            if (null != BD1.getNama()) switch (BD1.getNama()) {
                case "Circle":
                    System.out.println("Jari-jari        : " + 21);
                    break;
                case "Rectangle":
                    System.out.println("Panjang          : " + 15);
                    System.out.println("Lebar            : " + 8);
                    break;
                case "Triangle":
                    System.out.println("Alas             : " + 10);
                    System.out.println("Tinggi           : " + 12);
                    break;
                default:
                    break;
            }
            System.out.println("Luas             : " + BD1.hitungLuas());
            System.out.println("Keliling         : " + BD1.hitungKeliling());
            System.out.println("");
        }
        
    }
}
