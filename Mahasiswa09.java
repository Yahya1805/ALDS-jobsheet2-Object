
class Mahasiswa09 {
    String nama;
    String nim;
    String kelas;
    double ipk;

public Mahasiswa09() {

}

public Mahasiswa09(String nm, String nim, String kls, double ipk) {
    nama = nm;
    this.nim = nim;
    this.ipk = ipk;
    kelas = kls;

}

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Ipk: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
    
    void ubahKelas(String KelasBaru){
        kelas = KelasBaru;
        }

        void updateIpk(double ipkBaru){
            if (0.0 <= ipkBaru && ipkBaru <= 4.0){
                ipk = ipkBaru;
                System.out.println("IPK Valid");
            } else {
                System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
            }
        }

        String nilaiKinerja(){  
        if (ipk >= 3.5){
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0){
            return "Kinerja Baik";
        } else if (ipk >= 2.75){
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }

}