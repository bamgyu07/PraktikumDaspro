package Jobsheet10;

import java.util.Scanner;

public class TugasRataPertanyaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] surveiKepuasan = new int[10][6];
        double nilai;
        int pertanyaan;
        int jwbResponden;

        for (int i = 0; i < surveiKepuasan.length; i++) {
            System.out.println("Responden ke-" + (i+1));

            for (int j = 0; j < surveiKepuasan[i].length; j++) {
                System.out.print("Jawaban untuk pertanyaan ke-" + (j+1) + ": ");
                surveiKepuasan[i][j] = sc.nextInt();
            }
        }

        System.out.println("Apakah ingin menampilkan rata-rata? (ya/tidak)");
        String Tampilkan = sc.nextLine();

        if (Tampilkan.equalsIgnoreCase("ya")) {
            System.out.print("Rata-rata pertanyaan yang ke berapa? (1-6) ");
            int pertanyaanKe = sc.nextInt();
            
            if (pertanyaanKe >= 1 && pertanyaanKe <= 6) {
                double total = 0;

                for (int i = 0; i < surveiKepuasan.length; i++) {
                    total += surveiKepuasan[i][pertanyaanKe - 1];
                }
                double rata2 = total / surveiKepuasan.length;
                System.out.println("\n===========================");
                System.out.println("Rata-rata nilai untuk pertanyaan ke-" + pertanyaanKe + " adalah: " + rata2);
            } else {
                System.out.println("Nomor pertanyaan tidak valid");
            }
        } else {
            System.out.println("Terima kasih");
        }
    }
}