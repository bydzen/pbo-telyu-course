package TP06_1303194010;

/**
 *
 * @author SULTAN KAUTSAR | 1303194010
 */
public class Koordinat_1303194010 {
    private int x;
    private int y;
    
    public void Koordinat(int x, int y) {
        System.out.println("[+] Koordinat [+]");
        System.out.println("Koordinat X = " + x);
        System.out.println("Koordinat Y = " + y);
        
        // Add values to setter
        setX(x);
        setY(y);
        
        double coordinates = hitungJarak();
        
        System.out.printf("Coordinates = %.3f\n", coordinates);
        System.out.println("==================\n");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double hitungJarak() {
        // Calculate the coordinates
        double Koordinat = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
        
        return Koordinat;
    }
    
}
