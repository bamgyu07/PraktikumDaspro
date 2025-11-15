package Jobsheet09;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};

        int[] daftarPesanan = new int[daftarMenu.length];

        System.out.print("Masukkan jumlah item pesanan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine(); 

        // Proses input pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            String namaMenu = input.nextLine();
            System.out.print("Masukkan jumlah item: ");
            int jumlahItem = input.nextInt();
            input.nextLine(); 

            // Linear search 
            boolean ditemukan = false;
            for (int j = 0; j < daftarMenu.length; j++) {
                if (daftarMenu[j].equalsIgnoreCase(namaMenu)) {
                    daftarPesanan[j] += jumlahItem;
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Menu \"" + namaMenu + "\" tidak tersedia.");
            }
        }

        double totalHarga = 0;
        System.out.println("\n--- Daftar Pesanan Anda ---");
        for (int i = 0; i < daftarMenu.length; i++) {
            if (daftarPesanan[i] > 0) {
                double subtotal = daftarPesanan[i] * daftarHarga[i];
                System.out.println(daftarMenu[i] + " x " + daftarPesanan[i] + " = Rp" + subtotal);
                totalHarga += subtotal;
            }
        }

        System.out.println("---------------------------");
        System.out.println("Total yang harus dibayar: Rp" + totalHarga);

    }
}
