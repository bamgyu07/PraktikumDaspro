package Jobsheet05;

import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bilangan Maksimum dan Minimum");
        System.out.print("Masukkan bilangan pertama: ");
        int angka1 = sc.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int angka2 = sc.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int angka3 = sc.nextInt();

        if (angka1 >= angka2 && angka1 >= angka3) {
            System.out.println(angka1 + " adalah bilangan maksimum");
            if (angka2 <= angka3) {
                System.out.println(angka2 + " adalah bilangan minimum");
            }
            else {
                System.out.println(angka3 + " adalah bilangan minimum");
            }
        }
        else if (angka2 >= angka1 && angka2 >= angka3) {
            System.out.println(angka2 + " adalah bilangan maksimum");
            if (angka1 <= angka3) {
                System.out.println(angka1 + " adalah bilangan minimum");
            }
            else {
                System.out.println(angka3 + " adalah bilangan minimum");
            }
        }
        else {
            System.out.print(angka3 + " adalah bilangan maksimum");
            if (angka1 <= angka2) {
                System.out.print(angka1 + " adalah bilangan minimum");
            }
            else {
                System.out.print(angka2 + " adalah bilangan minimum");
            }
        }
    }
}