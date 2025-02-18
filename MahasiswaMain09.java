
public class MahasiswaMain09 {

    public static void main(String[] args) {
        Mahasiswa09 mhs1 = new Mahasiswa09();
        mhs1.nama = "M.Yahya Irvansyah";
        mhs1.nim = "244107020032";
        mhs1.kelas = "TI-1F";
        mhs1.ipk = 3.28;
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI-2F");
        mhs1.updateIpk(3.99);
        mhs1.tampilkanInformasi();

        Mahasiswa09 mhs2 = new Mahasiswa09("Lionel Messi","244107010032", "TI-4F", 4.0);
        mhs2.updateIpk(3.55);
        mhs2.tampilkanInformasi();

        Mahasiswa09 mhsmyahyairvansyah = new Mahasiswa09("M.Yahya Irvansyah","244107020032","TI-1F",3.90);
        mhsmyahyairvansyah.tampilkanInformasi();
    }
}