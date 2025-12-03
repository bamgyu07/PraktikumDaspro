package Jobsheet11;

public class PengunjungCafe03 {
    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }
    static void main(String[] args) {
        daftarPengunjung("Andi", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }

}