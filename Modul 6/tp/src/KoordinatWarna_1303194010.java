package TP06_1303194010;

/**
 *
 * @author SULTAN KAUTSAR | 1303194010
 */
public class KoordinatWarna_1303194010 {
    private String warna;
    Koordinat_1303194010 Koordinat_D = new Koordinat_1303194010();
    
    public void KoordinatWarna(int x, int y, String warna) {
        System.out.println("[+] Koordinat Warna [+]");
        System.out.println("Koordinat X = " + x);
        System.out.println("Koordinat Y = " + y);
        
        // Add values to setter
        Koordinat_D.setX(x);
        Koordinat_D.setY(y);
        setWarna(warna);
        
        // Get color
        String color = outWarna();
        
        System.out.println("Warna = " + color);
        System.out.println("==================\n");
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public double hitungJarak() {
        // Calculate the coordinates
        double KoordinatWarna = Math.sqrt(Math.pow(Koordinat_D.getX(), 2) 
                + Math.pow(Koordinat_D.getY(), 2));
        
        return KoordinatWarna;
    }
    
    public String outWarna() {
        String color = getWarna();
        
        return color;
    }
}
