package tp_1303194010;

public class DriverMahasiswa { 
    
    static class prodi {
        private String kode, nama;
        
        public void setKode(String kode) {
            this.kode = kode;
        }

        public void setNama(String nama){
            this.nama = nama;
        }
        
        public String getKode(){
            return this.kode;
        }

        public String getNama(){
            return this.nama;
        }
    }
    
    static class mahasiswa {
        private String nim, nama, prodi;

        public void setNim(String nim) {
            this.nim = nim;
        }

        public void setNama(String nama){
            this.nama = nama;
        }
        
        public void setProdi(String prodi){
            this.prodi = prodi;
        }
        
        public String getNim(){
            return this.nim;
        }

        public String getNama(){
            return this.nama;
        }
        
        public String getProdi(){
            return this.prodi;
        }
    }

    public static void main(String args[]) {
        // Prodi
        System.out.println("------ Daftar Prodi ------\n");
        prodi pr1 = new prodi();
        prodi pr2 = new prodi();

        pr1.setKode("SE");
        pr1.setNama("Rekayasa Perangkat Lunak");
        
        pr2.setKode("IT");
        pr2.setNama("Teknologi Informasi");

        System.out.println("Kode: " + pr1.getKode());
        System.out.println("Nama: " + pr1.getNama());
        
        System.out.println();
        
        System.out.println("Kode: " + pr2.getKode());
        System.out.println("Nama: " + pr2.getNama()); 
        
        // Mahasiswa
        System.out.println("\n\n------ Daftar Mahasiswa ------\n");
        mahasiswa mhs1 = new mahasiswa();
        mahasiswa mhs2 = new mahasiswa();
        mahasiswa mhs3 = new mahasiswa();
        
        mhs1.setNim("1302191234");
        mhs1.setNama("Eren Yeager");
        mhs1.setProdi(pr1.getNama() + " [" + pr1.getKode() + "]");
        
        mhs2.setNim("1303205555");
        mhs2.setNama("Armin Arlert");
        mhs2.setProdi(pr2.getNama() + " [" + pr2.getKode() + "]");
        
        mhs3.setNim("1302990001");
        mhs3.setNama("Mikasa Ackerman");
        mhs3.setProdi(pr1.getNama() + " [" + pr1.getKode() + "]");
        
        System.out.println("Nim: " + mhs1.getNim());
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("Prodi: " + mhs1.getProdi());
        
        System.out.println();
        
        System.out.println("Nim: " + mhs2.getNim());
        System.out.println("Nama: " + mhs2.getNama());
        System.out.println("Prodi: " + mhs2.getProdi());
        
        System.out.println();
        
        System.out.println("Nim: " + mhs3.getNim());
        System.out.println("Nama: " + mhs3.getNama());
        System.out.println("Prodi: " + mhs3.getProdi());
        
        // Tampilkan semua mahasiswa
        System.out.println("\n\n------ List Mahasiswa ------\n");
        System.out.println("mhs1: " + mhs1.getNim() + ", " + mhs1.getNama() + ", " + mhs1.getProdi());
        System.out.println("mhs2: " + mhs2.getNim() + ", " + mhs2.getNama() + ", " + mhs2.getProdi());
        System.out.println("mhs3: " + mhs3.getNim() + ", " + mhs3.getNama() + ", " + mhs3.getProdi());
        
    } 
}
