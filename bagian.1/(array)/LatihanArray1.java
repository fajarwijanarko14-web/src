package bagian1.array;

public class LatihanArray1 {

    public static void main(String[] args) {
        double[] suhu = {30.5, 32.0, 28.7, 31.2, 29.9, 33.1};

        double max = suhu[0];
        double min = suhu[0];

        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }

        System.out.println("Suhu tertinggi: " + max);
        System.out.println("Suhu terendah : " + min);
    }
}