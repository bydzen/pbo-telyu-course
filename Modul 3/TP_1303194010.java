package tp_1303194010;

import java.util.*;

public class TP_1303194010 {

    static class PRODI_1303194010 {
        String kode, nama;

        public String setKode(String kode) {
            return getKode(kode);
        }

        public String setNama(String nama) {
            return getNama(nama);
        }

        String getKode(String kode) {
            return kode;
        };

        String getNama(String nama) {
            return nama;
        };
    }

    static class MAHASISWA_1303194010 {
        String nim, nama, prodi;

        public String setNim(String nim) {
            return getNim(nim);
        }

        public String setNama(String nama) {
            return getNama(nama);
        }

        public String setProdi(String prodi) {
            return prodi;
        }

        String getNim(String nim) {
            return nim;
        };

        String getNama(String nama) {
            return nama;
        };

        String getProdi(String nama, String prodi) {
            return ("[" + setNama(nama) + "] (" + setProdi(prodi) + ")");
        };

        String getAngkatan(String nim) {
            // Masukan nim ke integer array
            int[] cektahun = new int[nim.length()];

            // Loopin tiap char di variabel nim dan masukan kedalam int array
            for (int i = 0; i < nim.length(); i++) {
                cektahun[i] = nim.charAt(i) - '0';
            }

            System.out.println("NIM: " + nim);

            // Kondisi-kondisi print untuk angkatan
            if (cektahun[4] >= 0 && cektahun[4] <= 2) {
                if (cektahun[4] == 1 ||cektahun[4] == 0) {
                    System.out.print("Angkatan: 20");
                    for (int i = 4; i <= Math.min(nim.length(), 5); i++) {
                        System.out.print(nim.charAt(i));
                    }
                } else if (cektahun[4] >= 2 && cektahun[5] >= 1) {
                    System.out.print("Angkatan: 0 (Belum ada angkatan!)");
                }
            } else {
                System.out.print("Angkatan: 19");
                for (int i = 4; i <= Math.min(nim.length(), 5); i++) {
                    System.out.print(nim.charAt(i));
                }
            }

            System.out.println();

            return nim;
        };
    }

    public static void main(String[] args) {

        // Panggil scanner untuk inputan user
        Scanner sc = new Scanner(System.in);

        System.out.println("--------- Input ---------\n");

        // Input kode prodi
        System.out.print("Masukan kode: ");
        String kode = sc.nextLine();

        // Error jika kode tidak sama dengan 2 karakter
        if (kode.length() != 2) {
            throw new IllegalArgumentException();
        }

        // Input nama prodi
        System.out.print("Masukan nama prodi: ");
        String nama = sc.nextLine();

        // Error jika inputan prodi kosong
        if (nama.length() == 0) {
            throw new IllegalArgumentException();
        }

        // Input NIM
        System.out.print("Masukan NIM: ");
        String nim = sc.nextLine();

        System.out.println("\n--------- Output ---------\n");

        // Memanggil method di dalam class prodi
        PRODI_1303194010 PRODI_1303194010 = new PRODI_1303194010();

        // Memanggil method di dalam class mahasiswa
        MAHASISWA_1303194010 MAHASISWA_1303194010 = new MAHASISWA_1303194010();

        // Input kode dan nama ke class prodi
        PRODI_1303194010.setKode(kode);
        PRODI_1303194010.setNama(nama);

        // Print nama dan kode ke class mahasiswa
        System.out.println(MAHASISWA_1303194010.getProdi(nama, kode));

        // Input nim ke class mahasiswa
        MAHASISWA_1303194010.getAngkatan(nim);

    }

}
