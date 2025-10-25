package Jobsheet06;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class latihan06 {
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

        switch (daya) {
            case 900:
                tarifPerKwh = 1300;
                break;
            case 1300:
            case 2200:
                tarifPerKwh = 1500;
                break;
            case 3500:
            case 5500:
                tarifPerKwh = 1700;
                break;
            default:
                System.out.print("Daya listrik tidak dikenali.");
                return;
        }

        double totalSebelumPajak = biayaTetapPLN + (tarifPerKwh * pemakaian);
        double  ppn = pajak * totalSebelumPajak;
        double totalBayar = totalSebelumPajak + ppn;

        System.out.print("Total tagihan listrik: Rp " + totalBayar);
    }
}
