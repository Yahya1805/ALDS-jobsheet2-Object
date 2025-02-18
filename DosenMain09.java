public class DosenMain09 {

    public static void main(String[] args) {
        Dosen09 dosen1 = new Dosen09();
        dosen1.nama = "M.Yahya Irvansyah";
        dosen1.idDosen = "D001";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Matematika";
        dosen1.tampilInformasi();
        dosen1.UbahKeahlian( "Fisika");
        dosen1.MasaKerja(2021);
        dosen1.tampilInformasi();

        Dosen09 dosen2 = new Dosen09("D002", "Nur Makhmudah", false, 2015, "Kimia");
        dosen2.tampilInformasi();
    }
}