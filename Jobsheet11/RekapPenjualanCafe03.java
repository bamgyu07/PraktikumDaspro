package Jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe03 {
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    static int [][] penjualan = new int [5][7]; //5 menu, 7 hari

    public static void inputDataPenjualan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = input.nextInt();
        input.nextLine(); // untuk membuang newline

        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = input.nextInt();
        input.nextLine(); // untuk membuang newline

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("\nMasukkan nama menu ke-" + (i + 1) + ": ");
            menu[i] = input.nextLine();

            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("  Penjualan hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
            input.nextLine(); // untuk membuang newline
        }
    }

    public static void tampilkanDataPenjualan() {
        System.out.println("\nTabel rekap penjualan cafe selama seminggu:");
        System.out.print("Menu\t\t");
        for (int j = 1; j < 7; j++) {
            System.out.printf("Hari "+ j + "\t");
        }
        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            if (menu[i].length() < 8) System.out.print("\t"); // rapikan tab
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void tampilkanMenuTerlaris() {
        int maxPenjualan = 0;
        String menuTerlaris = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxPenjualan) {
                maxPenjualan = total;
                menuTerlaris = menu[i];
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi: " + menuTerlaris + " (" + maxPenjualan + " buah)");
    }


    public static void tampilkanRataRataPenjualan() {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rata = total / (double) penjualan[i].length;
            System.out.printf("%-15s: %.2f buah\n", menu[i], rata);
        }
    }


    public static void main(String[] args) {
        inputDataPenjualan();
        tampilkanDataPenjualan();
        tampilkanMenuTerlaris();
        tampilkanRataRataPenjualan();
    }

}
