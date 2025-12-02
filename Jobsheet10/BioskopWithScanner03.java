package Jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton =  new String[4][2];
        int pilihan;

        do {
            System.out.println("\n=== MENU BIOSKOP MINI ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();

                        System.out.print("Masukkan baris (1-4): ");
                        int baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        int kolom = sc.nextInt();
                        sc.nextLine(); // clear buffer

                        // Validasi batas array
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor kursi tidak tersedia. Silakan coba lagi.");
                            continue;
                        }

                        // Validasi kursi sudah terisi
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1]);
                            System.out.println("Silakan pilih kursi lain.");
                            continue;
                        }

                        // Simpan nama penonton
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.print("Input penonton lainnya? (y/n): ");
                        String next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.printf("Baris %d Kolom %d: %s\n", i + 1, j + 1, isi);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem bioskop mini.");
                    break;

                default:
                    System.out.println("Menu tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        } while (pilihan != 3);
    }
}
<<<<<<< HEAD
  
=======
  
>>>>>>> de77c70f64d3b67c88dadd933d0f54f4c8249cdb
