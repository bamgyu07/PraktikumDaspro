package Jobsheet11;

import java.util.Scanner;

public class Kubus03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sisi;

        System.out.print("Masukkan sisi kubus: ");
        sisi = sc.nextInt();

        int luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);

        int volume = hitungVolume(sisi);
        System.out.println("Volume kubus adalah: " + volume);
        
    }
    static int hitungLuasPermukaan(int sisi1) {
        int luas = 6 * sisi1;
        return luas;
    }

    static int hitungVolume(int sisi1) {
        int volume = sisi1 * sisi1 * sisi1;
        return volume;
    }

}
