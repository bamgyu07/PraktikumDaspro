package Jobsheet10;

import java.util.Scanner;

public class TugasRataResponden {
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
            System.out.println("\n===============================");
            System.out.print("Rata-rata nilai survei kepuasan responden");

            for (int j = 0; j < 10; j++) {
                double total = 0;
                for (int i = 0; i < 6; i++) {
                    total += surveiKepuasan[i][j];
                }
                double rata2 = total / 6;
                System.out.print("Rata-ratanya adalah: " + rata2);
            }
        }
    }
}