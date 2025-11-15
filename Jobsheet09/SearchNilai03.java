package Jobsheet09;

import java.util.Scanner;

public class SearchNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int inputNilai = sc.nextInt();
        
        int[] arrNilai = new int [inputNilai];
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int nilai = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (nilai == arrNilai[i]) {
                hasil = i;
                break;
            } 
        }
        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + nilai + " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        System.out.println();
    }
}
