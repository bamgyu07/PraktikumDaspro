package Jobsheet10;

import java.util.Scanner;

public class SIAKAD03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatKul = sc.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMatKul];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMatKul; j++) {
                System.out.print("Nilai mata kuliah " + (j+1));
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Rata-rata mahasiswa ke-" + (i+1) + ": " + (totalPerSiswa/jumlahMatKul));
        }

        System.out.println("Rata-rata nilai setiap mata kuliah: ");
        for (int j = 0; j <jumlahMatKul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j+1) + ": " + (totalPerMatkul/jumlahSiswa));
        }
    }
}
