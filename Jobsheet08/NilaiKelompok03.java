package Jobsheet08;

import java.util.Scanner;

public class NilaiKelompok03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, totalNilai, rataNilai, maxRata = 0;
        int KelompokTerbaik = 0;
        totalNilai = 0;

            for (int i= 1; i <= 6; i++) {
                totalNilai = 0;
                System.out.println("Masukkan nilai untuk Kelompok " + i + ":");
                for (int j = 1; j <= 5; j++) {
                    System.out.print("  Nilai anggota ke-" + j + ": ");
                    nilai = sc.nextDouble();
                    totalNilai += nilai;
                }
                rataNilai = totalNilai / 5;
                System.out.println("Rata-rata nilai Kelompok " + i + " adalah: " + rataNilai);
                if (rataNilai > maxRata) {
                    maxRata = rataNilai;
                    KelompokTerbaik = i;
                }
            }
    
            System.out.println("Kelompok dengan rata-rata tertinggi adalah kelompok " + KelompokTerbaik + " dengan nilai rata-rata " + maxRata);
            sc.close();
        }
    }
