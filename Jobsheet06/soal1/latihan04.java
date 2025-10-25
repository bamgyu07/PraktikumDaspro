package Jobsheet06;

import java.util.Scanner;

public class latihan04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaSewa = 300000; // Biaya sewa per hari
        int biayaSupir = 200000; // Biaya supir per hari
        double diskon = 0.005; // Diskon 5%
        int hargaPertalite = 1000; // Harga per liter km
        int hargaPertamax = 1300; // Harga per liter km

        System.out.print("Masukkan lama sewa mobil (dalam hari): ");
        int lamaSewa = sc.nextInt();

        System.out.print("Apakah Anda membutuhkan supir? (ya/tidak): ");
        String butuhSupir = sc.next();

        System.out.print("Masukkan jarak tempuh (dalam km): ");
        int jarakTempuh = sc.nextInt();

        System.out.print("Bahan bakar apa yang kamu gunakan? Pertalite atau Pertamax: ");
        String bahanBakar = sc.next();

        if (lamaSewa > 30) {
            System.out.println("Lama sewa maksimal 30 hari");
            sc.close();
            return;
        }
        else if (bahanBakar.equalsIgnoreCase("Pertalite")) {
            double totalBiaya = (biayaSewa * lamaSewa) + (hargaPertalite * jarakTempuh);
                if (butuhSupir.equalsIgnoreCase("ya")) {
                totalBiaya += biayaSupir * lamaSewa;
                }
                if (totalBiaya > 2000000) {
                totalBiaya -= totalBiaya * diskon;
                }
            System.out.println("Total biaya sewa mobil dengan Pertalite: Rp " + totalBiaya);
        } 
        
        else if (bahanBakar.equalsIgnoreCase("Pertamax")) {
            double totalBiaya = (biayaSewa * lamaSewa) + (hargaPertamax * jarakTempuh);
                if (butuhSupir.equalsIgnoreCase("ya")) {
                totalBiaya += biayaSupir * lamaSewa;
                }
                if (totalBiaya > 2000000) {
                totalBiaya -= totalBiaya * diskon;
                }
            System.out.println("Total biaya sewa mobil dengan Pertamax: Rp " + totalBiaya);
        } else {
            System.out.println("Jenis bahan bakar tidak dikenali.");
        }
    }
}

