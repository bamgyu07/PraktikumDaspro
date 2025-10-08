package Jobsheet05;

import java.util.Scanner;

public class UjianSkripsiNested03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1:");
        int bimbinganP1 = sc.nextInt();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2:");
        int bimbinganP2 = sc.nextInt();

        sc.nextLine(); // consume the leftover newline
        System.out.print("Apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebasKompen = sc.nextLine();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendafar ujian skripsi.";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan p1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali.";
            } else {
                pesan = "Gagal! Log bimbingan P2 kurang dari 4 kali.";
            }
        } else {
            pesan = "Mahasiswa tidak boleh mendaftar ujian skripsi karena tidak bebas kompen.";
    }
    System.out.println(pesan);
}
}