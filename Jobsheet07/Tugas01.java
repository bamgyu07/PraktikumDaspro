import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000; //harga per tiket
        int jumlahTiket;
        double diskon1 = 0.1;
        double diskon2 = 0.15;

        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        jumlahTiket = sc.nextInt();

        double totalHarga = jumlahTiket * hargaTiket;
        double totalBayar;

        int i= 0;

       while (jumlahTiket <= 0) {
            System.out.println("Jumlah tiket tidak valid, silakan masukkan lagi.");
            return;
            } if (jumlahTiket > 10) {
                totalBayar = totalHarga - (totalHarga * diskon2);
                System.out.println("Anda mendapatkan diskon 15%.");
                System.out.println("Total yang harus dibayar: Rp" + totalBayar);
            } else if (jumlahTiket > 4) {
                totalBayar = totalHarga - (totalHarga * diskon1);
                System.out.println("Anda mendapatkan diskon 10%.");
                System.out.println("Total yang harus dibayar: Rp" + totalBayar);
            } else {
                totalBayar = totalHarga;
                System.out.println("Tidak ada diskon.");
                System.out.println("Total yang harus dibayar: Rp" + totalBayar);
            }
            i++;
        }
    }
}

