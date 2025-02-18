public class MatakuliahMain {

    public static void main(String[] args) {
        MataKuliah09 matkul1 = new MataKuliah09("MK001", "Matematika", 3, 40);
        matkul1.tampilInformasi();
        matkul1.ubahSks(4);
        matkul1.tambahJam(20);
        matkul1.kurangiJam(10);
        matkul1.tampilInformasi();
    }
}