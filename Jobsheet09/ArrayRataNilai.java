package Jobsheet09;

import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        double total = 0;
        double rata2;
        int[] nilaiMhs = new int [jmlMhs];
        int tidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] < 70) {
                tidakLulus++;
            }
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai: " + rata2);

        if (rata2 > 70) {
            System.out.println("Rata-rata nilai lulus");
        } else {
            System.out.println("Rata-rata nilai tidak lulus");
        }

        System.out.println("Banyak mahasiswa yang tidak lulus: " + tidakLulus);
    }
}
