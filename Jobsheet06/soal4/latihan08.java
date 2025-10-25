package Jobsheet06;

import java.util.Scanner;

public class latihan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //biaya
        int cetakHlm = 200;
        int hardCover = 20000;
        int softCover = 10000;
        int biayaKirim = 15000; //per 1 kg

        //gram
        int beratHlm = 3; 
        int beratHardCover = 250;
        int beratSoftCover = 100;
        int beratPacking = 300;

        System.out.print("Masukkan jumlah halaman: ");
        int jmlHlm = sc.nextInt();
        int jmlLembar = (int) Math.ceil(jmlHlm / 2);

        System.out.print("Jenis Cover: (Hard Cover/Soft Cover): ");
        String jenisCover = sc.next();

        if (jenisCover.equalsIgnoreCase("Hard")) {
            jenisCover = "Hard";
        } else if (jenisCover.equalsIgnoreCase("Soft")) {
            jenisCover = "Soft";
        } else {
            System.out.println("Jenis cover tidak valid.");
        }
        int biayaCetak = (jmlLembar * cetakHlm) + (jenisCover.equalsIgnoreCase("Hard") ? hardCover : softCover);
        
        int totalBerat = (jmlLembar * beratHlm) + (jenisCover.equalsIgnoreCase("Hard") ? beratHardCover : beratSoftCover) + beratPacking;
        // hitung biaya kirim (totalBerat dalam gram, tarif 15000 per 1 kg)
        int beratKg = (int) Math.ceil(totalBerat / 1000.0);
        biayaKirim = beratKg * 15000;
        int totalBiaya = biayaCetak + biayaKirim;

        System.out.println("Biaya Cetak: Rp " + biayaCetak);
        System.out.println("Biaya Kirim: Rp " + biayaKirim);
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}
