class Dosen09 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen09() {

    }

    public Dosen09(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("ID DOSEN: " + idDosen);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    
    void statusAktif(boolean status){
        statusAktif = status;
        if (statusAktif == true){
            System.out.println("Dosen aktif");
        } else {
            System.out.println("Dosen tidak aktif");
        }
    }
    
    void MasaKerja(int tahun){
        int MasaKerja = tahun - tahunBergabung;
        System.out.println("Masa Kerja: " + MasaKerja + " tahun");
    }
    
    void UbahKeahlian(String keahlian){
        bidangKeahlian = keahlian;
    }
}
