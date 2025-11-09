package Jobsheet08;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int batas = 5;

        for (int n = 1; n <= batas; n++) {
            int jumlahKuadrat = 0;
            String ekspresi = "";

            for (int i = 1; i <= n; i++) {
                int kuadrat = i * i;
                jumlahKuadrat += kuadrat;

                ekspresi += kuadrat;
                if (i < n) {
                    ekspresi += " + ";
                }
            }
            System.out.println("n = " + n + " -> jumlah kuadrat = " + ekspresi + " = " + jumlahKuadrat);
        }

    }
}
