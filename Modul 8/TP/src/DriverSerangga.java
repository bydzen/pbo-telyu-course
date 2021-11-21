package TP08;

public class DriverSerangga {
    public static void main(String[] args) {
        // Semut reference serangga
        Serangga ref_S = new Semut("merah", 70, 90);
        
        Semut s = (Semut) ref_S;
        System.out.println("Warna Semut  : " + s.getWarna());
        s.info();
        s.gerak(new int[]{80, 100});
        s.info();
        
        // Lebah reference serangga
        Serangga ref_L = new Lebah("oranye", 30, 40, 50);
        
        Lebah l = (Lebah) ref_L;
        System.out.println("Warna Lebah  : " + l.getWarna());
        l.info();
        l.gerak(new int[]{45, 55, 65});
        l.info();
    }
}
