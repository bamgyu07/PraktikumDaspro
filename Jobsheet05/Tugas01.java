package Jobsheet05;

import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka:");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.print(angka + " adalah bilangan genap.");
        } else {
            System.out.print(angka + " adalah bilangan ganjil.");
        }
    }
}
