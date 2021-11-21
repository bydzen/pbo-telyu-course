package TP08;

public class Lebah extends Serangga {
    private Koordinat3D posisi;

    public Lebah(String warna, int x, int y, int z) {
        super(warna);
        this.posisi = new Koordinat3D(x, y, z);
    }
    
    @Override
    public void gerak(int[] gerakLebah) {
        posisi = new Koordinat3D(gerakLebah[0], gerakLebah[1], gerakLebah[2]);
    }
        
    @Override
    public void info() {
        System.out.println("Posisi Lebah : X = " + posisi.getX());
        System.out.println("               Y = " + posisi.getY());
        System.out.println("               Z = " + posisi.getZ());
    }
    
}
