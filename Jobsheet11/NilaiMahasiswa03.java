package Jobsheet11;

import java.util.Scanner;

public class NilaiMahasiswa03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);

        int totalNilai =hitTot(nilaiMahasiswa);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);
    }

    static void isianArray(int[] nilai) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        input.close();
    }

    static void tampilArray(int[] nilai) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    static int hitTot(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }
}
