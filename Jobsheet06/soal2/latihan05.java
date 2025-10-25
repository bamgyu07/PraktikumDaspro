package Jobsheet06;

import java.util.Scanner;

public class latihan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaTetapPLN = 50000;
        int tarifListrik = 1500; //per kwh
        double pajak = 0.1; //pajak 10%
        double tarifPerKwh;

        System.out.print("Masukkan daya listrik (900, 1300, 2200, 3500, 5500): ");
        int daya = sc.nextInt();

        System.out.print("Masukkan pemakaian listrik dalam kWh: ");
        int pemakaian = sc.nextInt();

        if (daya == 900) {
            tarifPerKwh = 1300;
        } else if (daya == 1300 || daya == 2200) {
            tarifPerKwh = 1500;
        } else if (daya == 3500 || daya == 5500) {
            tarifPerKwh = 1700;
        } else {
            System.out.print("Daya listrik tidak dikenali.");
            return;
        }

        double totalSebelumPajak = biayaTetapPLN + (tarifPerKwh * pemakaian);
        double  ppn = pajak * totalSebelumPajak;
        double totalBayar = totalSebelumPajak + ppn;

        System.out.print("Total tagihan listrik: Rp " + totalBayar);
    }
}
