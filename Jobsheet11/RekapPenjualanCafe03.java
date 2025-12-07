package Jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe03 {
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    static int [][] penjualan = new int [5][7]; //5 menu, 7 hari

    public static void inputDataPenjualan() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan data penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari " + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
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
            if (menu[i].length() < 8) {
                System.out.print("\t");
            }
            for (int x = 0; x < 7; x++) {
                System.out.print("" + penjualan[i][x] + "\t");
            }
            System.out.println();
        }
    }

    public static void tampilkanMenuTerlaris() {
        int maxPenjualan = 0;
        String menuTerlaris = "";
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualanMenu = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualanMenu += penjualan[i][j];
            }
            if (totalPenjualanMenu > maxPenjualan) {
                maxPenjualan = totalPenjualanMenu;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("\nMenu terlaris selama seminggu adalah: " + menuTerlaris + " dengan total penjualan: " + maxPenjualan);
    }

    public static void tampilkanNilaiRata() {
        System.out.println("\nNilai rata-rata penjualan per menu selama seminggu:");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualanMenu = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualanMenu += penjualan[i][j];
            }
            double rataRata = totalPenjualanMenu / 7.0;
            System.out.printf("%-15s: %.2f buah\n", menu[i], rataRata);
        }
    }

    public static void main(String[] args) {
        inputDataPenjualan();
        tampilkanDataPenjualan();
        tampilkanMenuTerlaris();
        tampilkanNilaiRata();
    }
}
