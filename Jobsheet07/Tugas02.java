import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis,durasi,total;
        //harga parkir motor per jam
        int parkirMotor = 2000;
        //harga parkir mobil per jam
        int parkirMobil = 3000;
        //harga parkir jika lebih dari 5 jam
        int parkirLebih5Jam = 12500;

        System.out.print("Jenis Kendaraan: (1. motor, 2. mobil): ");
        jenis = sc.nextInt();
        System.out.print("Durasi parkir (dalam jam):");
        durasi = sc.nextInt();

        if (jenis == 1 || jenis == 2) {
            if (durasi > 5) {
                System.out.println("Total biaya parkir : Rp" + parkirLebih5Jam);
            } else {
                if (jenis == 1) {
                    total = durasi * parkirMotor;
                    System.out.println("Total biaya parkir motor selama " + durasi + " jam adalah Rp" + total);
                } else {
                    total = durasi * parkirMobil;
                    System.out.println("Total biaya parkir mobil selama " + durasi + " jam adalah Rp" + total);
                }
            }
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
        }
    }
}

