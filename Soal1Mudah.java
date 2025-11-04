import java.util.Scanner;

public class Soal1Mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.print("Masukkan berat barang (kg): ");
        int berat = input.nextInt();

        System.out.print("Masukkan jarak pengiriman (km): ");
        int jarak = input.nextInt();
        System.out.println("---------------------------------");

        System.out.print("Masukkan Lebar (L): ");
        int lebar = input.nextInt();

        System.out.print("Masukkan Panjang (P): ");
        int panjang = input.nextInt();

        System.out.print("Masukkan Tinggi (T): ");
        int tinggi = input.nextInt();
        System.out.println("---------------------------------");

        int biayaJarak;

        if (jarak <= 10) {
            biayaJarak = 4250;
        } else if (jarak > 10) {
            biayaJarak = 6000;
        }else {
            biayaJarak = 0;
        }

        // Hitung
        int volume = lebar * panjang * tinggi;
        int totalBiaya = (berat * biayaJarak);

        if (volume > 100) {
            totalBiaya += 50000;
        }

        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);

    }
}

