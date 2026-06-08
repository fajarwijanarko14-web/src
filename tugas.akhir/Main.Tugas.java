package tugas;

// Nama: Fajar Wijanarko
// NPM : 2410010571

public class MainTugas {
    public static void main(String[] args) {
        KelasKuliah kelas = new KelasKuliah();

        // Tambah minimal 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "2410010001", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2410010002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2410010003", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Dewi", "2410010004", 60));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "2410010005", 45));

        // Tampilkan semua mahasiswa
        kelas.tampilkanSemua();

        // Simpan daftar mata kuliah dalam array
        String[] mataKuliah = {"Pemrograman", "Basis Data", "Jaringan"};
        System.out.println("\n== Daftar Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println(mk);
        }

        // Tampilkan rata-rata nilai dan jumlah lulus
        System.out.println("\nRata-rata nilai: " + kelas.hitungRataRata());
        System.out.println("Jumlah mahasiswa lulus: " + kelas.jumlahLulus());

        // Tambahkan satu mahasiswa baru
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "2410010006", 90));
        System.out.println("\nJumlah data terbaru: " + kelas.jumlahMahasiswa());
    }
}