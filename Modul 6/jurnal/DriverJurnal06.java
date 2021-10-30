package DriverJurnal06;

public class DriverJurnal06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Serangga A = new Serangga("merah", 20, 30);
        System.out.println("Posisi awal A: " + A.getPosisi().getX() + ", "+A.getPosisi().getY());
        A.gerak(40, 50);
        System.out.println("Posisi akhir A: " + A.getPosisi().getX() + ", "+A.getPosisi().getY());

        Semut B = new Semut("hitam", 50, 80);
        System.out.println("Sarang B: " + B.getPosisi().getX() + ", "+B.getPosisi().getY());
        System.out.println("Posisi awal B: " + B.getPosisi().getX() + ", "+B.getPosisi().getY());
        System.out.println("Rute B: ");
        if(B.getJmlRute()==0) System.out.println("--");
        else for (Koordinat k: B.getRute())
             System.out.println("   "+k.getX()+", "+k.getY());
        B.gerak(60, 100);
        B.gerak(70, 120);
        B.gerak(80, 140);
        
        System.out.println("Posisi gerak B: " + B.getPosisi().getX() + ", "+B.getPosisi().getY());
        System.out.println("Rute B: ");
        if(B.getJmlRute()==0) System.out.println("--");
        else for (Koordinat k: B.getRute())
             System.out.println("   "+k.getX()+", "+k.getY());
        B.KembaliKeSarang();
        
        System.out.println("Posisi akhir B: " + B.getPosisi().getX() + ", "+B.getPosisi().getY());
        System.out.println("Rute B: ");
        if(B.getJmlRute()==0) System.out.println("--");
        else for (Koordinat k: B.getRute())
            System.out.println("   "+k.getX()+", "+k.getY());
    }
    
}
