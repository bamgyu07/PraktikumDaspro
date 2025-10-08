package Jobsheet05;

import java.util.Scanner;

public class PemilihanHariDenganIf03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nomor absen (1-7): ");
        int nomor = sc.nextInt();

        if (nomor >= 1 && nomor <= 5) {
            System.out.println("Weekday");
        } else if (nomor == 6 || nomor == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}