package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftar = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftar.add(mhs);
    }

    public double hitungRataRata() {
        double total = 0;
        for (Mahasiswa m : daftar) {
            total += m.getNilai();
        }
        return total / daftar.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;
        for (Mahasiswa m : daftar) {
            if (m.lulus()) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Mahasiswa ==");
        for (Mahasiswa m : daftar) {
            String status = m.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.println(m.getNpm() + " - " + m.getNama() + " : " + m.getNilai() + " (" + status + ")");
        }
    }

    public int jumlahMahasiswa() {
        return daftar.size();
    }
}