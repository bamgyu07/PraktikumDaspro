package Jobsheet10;

import java.util.Scanner;

public class TugasMenyimpanData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] surveiKepuasan = new int[10][6];
        double nilai;
        int pertanyaan;
        int jwbResponden;

        for (int i = 0; i < surveiKepuasan.length; i++) {
            System.out.println("Responden ke-" + (i+1));

            for (int j = 0; j < surveiKepuasan[i].length; j++) {
                System.out.print("Jawaban untuk pertanyaan ke-" + (j+1) + ": ");
                surveiKepuasan[i][j] = sc.nextInt();
            }
        }
    }
}