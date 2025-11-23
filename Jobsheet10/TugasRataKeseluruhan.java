package Jobsheet10;

import java.util.Scanner;

public class TugasRataKeseluruhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;
        int[][] surveiKepuasan = new int[responden][pertanyaan];

        for (int i = 0; i <responden; i++) {
            System.out.println("Responden ke-" + (i+1));
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("Jawaban untuk pertanyaan ke-" + (j+1) + ": ");
                surveiKepuasan[i][j] = sc.nextInt();
            }
        }
        sc.nextLine(); // bersihkan line

        System.out.println("\nApakah ingin menampilkan rata-rata keseluruhan? (ya/tidak): ");
        String tampilkan = sc.nextLine();

        if (tampilkan.equalsIgnoreCase("ya")) {
            System.out.println("\nPilih opsi: ");
            System.out.println("1. Rata-rata pertanyaan tertentu");
            System.out.println("2. Rata-rata keseluruhan survei");
            int pilihan = sc.nextInt();

            if (pilihan == 1) {
                System.out.print("Rata-rata pertanyaan ke berapa? (1-6): ");
                int pertanyaanKe = sc.nextInt();

                if (pertanyaanKe > 1 && pertanyaanKe < pertanyaan) {
                    double total = 0;
                    for (int i = 0; i < responden; i++) {
                        total += surveiKepuasan[i][pertanyaanKe - 1];
                    }
                    double rata2 =  total / responden;
                    System.out.println("Rata-rata nilai untuk pertanyaan ke-" + pertanyaanKe + " adalah: " + rata2);
                } else {
                    System.out.println("Nomor pertanyaan tidak valid.");
                }
            } else if (pilihan == 2) {
                double total = 0;
                int jumlahData = responden * pertanyaan;

                for (int i = 0; i < responden; i++) {
                    for (int j = 0; j < pertanyaan; j++) {
                        total += surveiKepuasan[i][j];
                    }
                }

                double rata2Keseluruhan = total / jumlahData;
                System.out.println("Rata-rata keseluruhan survei adalah: " + rata2Keseluruhan);
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } else {
            System.out.println("Terimakasih!");
        }
    }
}