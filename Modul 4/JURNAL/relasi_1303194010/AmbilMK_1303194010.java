package relasi_1303194010;

import entitas_1303194010.Mahasiswa_1303194010;
import entitas_1303194010.MataKuliah_1303194010;

public class AmbilMK_1303194010 {
    private MataKuliah_1303194010 matakuliah;
    private Mahasiswa_1303194010 mahasiswa;
    private String nilai;
    private String tahun_ajaran;

    public void setMatakuliah(MataKuliah_1303194010 matakuliah) {
        this.matakuliah = matakuliah;
    }

    public void setMahasiswa(Mahasiswa_1303194010 mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public void setTahun_ajaran(String tahun_ajaran) {
        this.tahun_ajaran = tahun_ajaran;
    }

    public MataKuliah_1303194010 getMatakuliah() {
        return matakuliah;
    }

    public Mahasiswa_1303194010 getMahasiswa() {
        return mahasiswa;
    }

    public String getNilai() {
        return nilai;
    }

    public String getTahun_ajaran() {
        return tahun_ajaran;
    } 
}
