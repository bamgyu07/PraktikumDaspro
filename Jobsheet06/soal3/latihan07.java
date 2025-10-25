package Jobsheet06;

import java.util.Scanner;

public class latihan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaPublikasi = 300000;
        int biayaDekorasi = 500000;
        int konsumPanitiaJuri = 500000;
        int biayaOperasional = 500000;
        int konsumPeserta = 25000; //per orang
        int biayaHonoriumJuri = 75000; //per judul
        int biayaPendaftaran = 50000; //per tim

        System.out.print("Masukkan jumlah tim: ");
        int jumlahTim = sc.nextInt();

        System.out.print("Apakah pihak polinema bersedia memberi dana sponsorship? (ya/tidak): ");
        String sponsorship = sc.next();

        double persentasePolinema;

        if (sponsorship.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan persentase dana sponsorship dari polinema (tanpa %): ");
            persentasePolinema = sc.nextDouble();
        } else if (sponsorship.equalsIgnoreCase("tidak")) {
            persentasePolinema = 0.0;
        } else {
            System.out.println("Input tidak valid. Mengasumsikan tidak ada bantuan sponsorship.");
            persentasePolinema = 0.0;
        }

        int jumlahPeserta = jumlahTim * 3;
        int totalPendaftaran = jumlahTim * biayaPendaftaran;
        int totalKonsumsiPeserta = jumlahPeserta * konsumPeserta;
        int totalHonoriumJuri = biayaHonoriumJuri * jumlahTim;

        int totalBiayaTetap = biayaPublikasi + biayaDekorasi + konsumPanitiaJuri + biayaOperasional;
        int totalAnggaran = totalBiayaTetap + totalKonsumsiPeserta + totalHonoriumJuri;
        double biayaPolinema = (persentasePolinema / 100) * totalAnggaran;
        double danaSponsor = totalAnggaran - totalPendaftaran - biayaPolinema;

        if (danaSponsor <= 0) {
            System.out.printf("Dana sudah tercukupi. Kelebihan dana: Rp %,d\n", (int) Math.abs(danaSponsor));
        } else {
            System.out.printf("Dana sponsorship yang perlu dicari: Rp %,d\n", (int) danaSponsor);
}

        System.out.println("\n--- RINCIAN DANA ---");
        System.out.println("Total Anggaran: Rp " + totalAnggaran);
        System.out.println("Total Biaya Polinema: Rp " + biayaPolinema);
        System.out.println("Total Dana Sponsor: Rp " + danaSponsor);
        System.out.println("Total Biaya Setelah Sponsorship: Rp " + (totalAnggaran - biayaPolinema));
        sc.close();

    }
}