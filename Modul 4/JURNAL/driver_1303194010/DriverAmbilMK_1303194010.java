package driver_1303194010;

import entitas_1303194010.Mahasiswa_1303194010;
import entitas_1303194010.MataKuliah_1303194010;
import relasi_1303194010.AmbilMK_1303194010;

public class DriverAmbilMK_1303194010 {
        
    public static void main(String[] args) {
        MataKuliah_1303194010 pbo = new MataKuliah_1303194010("pbo", "Pemrograman Berorientasi Obyek", 4);
        MataKuliah_1303194010 aplat = new MataKuliah_1303194010("apb", "Aplikasi Perangkat Bergerak", 4);
        MataKuliah_1303194010 apb = new MataKuliah_1303194010("aplat", "Aplikasi Berbasis Platform", 3);
        
        Mahasiswa_1303194010 mhs1 = new Mahasiswa_1303194010(1303194010, "Sultan Kautsar", 43);
        Mahasiswa_1303194010 mhs2 = new Mahasiswa_1303194010(1303193010, "Budi Hermawan", 44);
        
        AmbilMK_1303194010 elemen1 = new AmbilMK_1303194010(mhs1, "pbo", "A", "20/21");
        AmbilMK_1303194010 elemen2 = new AmbilMK_1303194010(mhs1, "aplat", "C", "20/21");
        AmbilMK_1303194010 elemen3 = new AmbilMK_1303194010(mhs1, "apb", "AB", "20/21");
        AmbilMK_1303194010 elemen4 = new AmbilMK_1303194010(mhs2, "apb", "AB", "20/21");
        AmbilMK_1303194010 elemen5 = new AmbilMK_1303194010(mhs2, "apb", "AB", "20/21");
        AmbilMK_1303194010 elemen6 = new AmbilMK_1303194010(mhs2, "apb", "AB", "20/21");
        AmbilMK_1303194010 elemen7 = new AmbilMK_1303194010(mhs1, "apb", "AB", "20/21");
        
    }
    
}
