package TP06_1303194010;

/**
 *
 * @author SULTAN KAUTSAR | 1303194010
 */
public class DriverTP06_1303194010 {
    public static void main(String[] args) {
        // Create constructor Koordinat_A
        Koordinat_1303194010 Koordinat_A = new Koordinat_1303194010();  
        
        // Add arguments with x = 15 and y = 12
        Koordinat_A.Koordinat(15, 12);
        
        // Create constructor Koordinat3D_B and Koordinat3D_C
        Koordinat3D_1303194010 Koordinat3D_B = new Koordinat3D_1303194010();
        Koordinat3D_1303194010 Koordinat3D_C = new Koordinat3D_1303194010();
        
        // Add arguments with x = 10, y = 28, and z = 30
        Koordinat3D_B.Koordinat3D(10, 28, 30);
        
        // [Output 1] Distance between B and A
        double x_B1, x_A, result__xB1A;
        x_B1 = Koordinat3D_B.hitungJarak();
        x_A = Koordinat_A.hitungJarak();
        result__xB1A = x_B1 - x_A;
        System.out.printf("[Output 1] Jarak antara B dengan A = %.3f\n\n"
                , result__xB1A);
        
        // Add arguments with x = 11, y = 26, and z = 32
        Koordinat3D_C.Koordinat3D(11, 26, 32);
        
        // [Output 2] Distance between B and C
        double x_B2, x_C, result__xB2C;
        x_B2 = Koordinat3D_B.hitungJarak();
        x_C = Koordinat3D_C.hitungJarak();
        result__xB2C = x_B2 - x_C;
        System.out.printf("[Output 2] Jarak antara B dengan C = %.3f\n\n"
                , result__xB2C);
        
        // Create constructor KoordinatWarna_D and KoordinatWarna_E
        KoordinatWarna_1303194010 KoordinatWarna_D = new KoordinatWarna_1303194010();
        KoordinatWarna_1303194010 KoordinatWarna_E = new KoordinatWarna_1303194010();
        
        // Add arguments with x = 35, y = 60, warna = "hitam"
        KoordinatWarna_D.KoordinatWarna(35, 60, "hitam");
        // Add argiments with x = 25, y = 50, warna = "putih"
        KoordinatWarna_E.KoordinatWarna(25, 50, "putih");
        
        // [Output 3] Distance between B and D
        double x_B3, x_D1, result__xB3D;
        String x_ColorD;
        x_B3 = Koordinat3D_B.hitungJarak();
        x_D1 = KoordinatWarna_D.hitungJarak();
        x_ColorD = KoordinatWarna_D.outWarna();
        result__xB3D = x_B3 - x_D1;
        System.out.printf("[Output 3] Jarak antara B dengan D = %.3f\n"
                + "[Output 3] Dengan warna = %s\n\n", result__xB3D, x_ColorD);
        
        // [Output 3] Distance between D and E
        double x_D2, x_E, result__xD2E;
        String x_ColorE;
        x_D2 = KoordinatWarna_D.hitungJarak();
        x_E = KoordinatWarna_E.hitungJarak();
        x_ColorE = KoordinatWarna_E.outWarna();
        result__xD2E = x_D2 - x_E;
        System.out.printf("[Output 4] Jarak antara D dengan E = %.3f\n"
                + "[Output 4] Dengan warna = %s\n", result__xD2E, x_ColorE);
        
        System.out.println();
    }
}
