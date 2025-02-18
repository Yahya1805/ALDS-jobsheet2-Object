
class MataKuliah09 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah09() {

    }

    public MataKuliah09(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Jumlah Sks: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    
    void ubahSks(int sksBaru){
        sks = sksBaru;
    }
    
    void tambahJam(int jamBaru){
        jumlahJam += jamBaru;
    }
    
    void kurangiJam(int jam){
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Jumlah jam baru: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
        }
    }
}
