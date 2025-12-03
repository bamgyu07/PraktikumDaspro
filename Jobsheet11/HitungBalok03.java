package Jobsheet11;

import java.util.Scanner;

public class HitungBalok03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("Masukkan panjang: ");
        p = sc.nextInt();

        System.out.println("Masukkan lebar: ");
        l = sc.nextInt();

        System.out.println("Masukkan tinggi: ");
        t = sc.nextInt();

        L = hitungLuas(p,l);
        System.out.println("Luas persegi panjang adalah: " + L);

        vol = hitungVolume(p,l,t);
        System.out.println("Volume balok adalah: " + vol);
        
    }

    static int hitungLuas (int pjg, int lb) {
        int luas = pjg * lb;
        return luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
}
