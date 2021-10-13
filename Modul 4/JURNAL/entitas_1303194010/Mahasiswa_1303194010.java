package entitas_1303194010;

import relasi_1303194010.AmbilMK_1303194010;

public class Mahasiswa_1303194010 {
    private int nim;
    private String nama;
    private String kelas;
    private String prodi;
    
    public Mahasiswa_1303194010(int nim, String nama, int nokelas) {
        int digitFour = Integer.parseInt(Integer.toString(nim).substring(0, 4));
        int thnAngkatan = Integer.parseInt(Integer.toString(nim).substring(5, 7));
        
        nokelas = thnAngkatan;
        
        switch (digitFour) {
            case 1301:
                prodi = "IF";
                break;
            case 1302:
                prodi = "SE";
                break;
            case 1303:
                prodi = "IT";
                break;
            default:
                break;
        }
        
        nokelas += 24;
        String sNokelas = String.valueOf(nokelas);
        
        String angkatan = "20" + String.valueOf(thnAngkatan);
        
        kelas  = prodi + "-" + angkatan + "-" + sNokelas;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public String getProdi() {
        return prodi;
    }
    
    public void hitungIPK(AmbilMK_1303194010 ambilMK[], AmbilMK_1303194010 tahun_ajaran) {
        double IPK = 0.00;
        String indexIPK;
        
        switch (IPK) {
            case IPK <= 4.00:
                indexIPK = "A";
            case IPK <= 3.50:
                indexIPK = "AB";
            case IPK <= 3.00:
                indexIPK = "B";
            case IPK <= 2.50:
                indexIPK = "BC";
            case IPK <= 2.00:
                indexIPK = "C";
            case IPK <= 1:
                indexIPK = "D";
            case IPK <= 0:
                indexIPK = "E";
            default:
                break;
        }
    }
    
}
