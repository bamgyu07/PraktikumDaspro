package Jobsheet05;

import java.util.Scanner;

public class CetakKRS03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverivikasi");
            System.out.println("Silahkan Cetak KRS dan minta tanda tanggan DPA");
        }
        else {
            System.out,println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu")
                }
    sc.close();
    }
}
