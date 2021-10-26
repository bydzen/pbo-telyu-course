package TP06_1303194010;

/**
 *
 * @author SULTAN KAUTSAR | 1303194010
 */
public class Koordinat3D_1303194010 {
    private int z;
    Koordinat_1303194010 Koordinat_B = new Koordinat_1303194010();
    
    public void Koordinat3D(int x, int y, int z) {
        System.out.println("[+] Koordinat 3D [+]");
        System.out.println("Koordinat X = " + x);
        System.out.println("Koordinat Y = " + y);
        System.out.println("Koordinat Z = " + z);
        
        // Add values to setter
        Koordinat_B.setX(x);
        Koordinat_B.setY(y);
        setZ(z);
        
        double coordinates = hitungJarak();
        
        System.out.printf("Coordinates = %.3f\n", coordinates);    
        System.out.println("==================\n");
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    public double hitungJarak() {
        // Calculate the coordinates
        double Koordinat3D = Math.sqrt(Math.pow(Koordinat_B.getX(), 2) 
                + Math.pow(Koordinat_B.getY(), 2) + Math.pow(getZ(), 2));
        
        return Koordinat3D;
    }
}
