package entitas_1303194010;

public class MataKuliah_1303194010 {
    private String kode;
    private String nama;
    private int sks;
    
    public MataKuliah_1303194010(String kode, String nama, int sks) {
            if (kode == "pbo") {
                kode = "CII3B4";
            } else if (kode == "aplat") {
                kode = "CII3H4";
            } else if (kode == "apb") {
                kode = "CTI3I3";
            }
            
            System.out.println(kode + " " + nama + " " + sks);
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }
}
