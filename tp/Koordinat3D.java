package TP07;

public class Koordinat3D extends Koordinat{
    private int z;

    public Koordinat3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    
    public int getZ() {
        return z;
    }
    
    public void setZ(int z) {
        this.z = z;
    }
}
