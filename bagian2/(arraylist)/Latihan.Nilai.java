package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanNilai {
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(12);
        angka.add(45);
        angka.add(7);
        angka.add(30);
        angka.add(18);

        int terbesar = angka.get(0);
        for (int n : angka) {
            if (n > terbesar) {
                terbesar = n;
            }
        }

        System.out.println("Data Angka     : " + angka);
        System.out.println("Nilai Terbesar : " + terbesar);
    }
}