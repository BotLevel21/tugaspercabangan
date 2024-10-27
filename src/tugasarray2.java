import java.util.ArrayList;
import java.util.Scanner;

public class tugasarray2 {
    public static void main(String[] args) {
        // Daftar buah dan harga
        String[][] Buah = {
                {"apel", "35000"},
                {"jeruk", "50000"},
                {"mangga", "25000"},
                {"duku", "15000"},
                {"semangka", "20000"}
        };

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namaBuah = new ArrayList<>();
        ArrayList<Integer> jumlahBuah = new ArrayList<>();
        ArrayList<Integer> hargaBuah = new ArrayList<>();

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Beli Buah");
            System.out.println("2. Struk Belanja");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                // Menu beli buah
                boolean beliLagi;
                do {
                    System.out.print("Pilih Buah (0-4): ");
                    int pilihBuah = scanner.nextInt();
                    System.out.print("Masukkan jumlah: ");
                    int jumlah = scanner.nextInt();

                    namaBuah.add(Buah[pilihBuah][0]);
                    hargaBuah.add(Integer.parseInt(Buah[pilihBuah][1]));
                    jumlahBuah.add(jumlah);

                    System.out.print("Input lagi? (y/n): ");
                    beliLagi = scanner.next().equalsIgnoreCase("y");
                } while (beliLagi);
            } else if (pilihan == 2) {
                // Menampilkan struk belanja
                System.out.println("Daftar Belanja:");
                System.out.println("========================================");
                System.out.println("No. Nama Buah   Jumlah   Harga   Subtotal");

                int total = 0;
                for (int i = 0; i < namaBuah.size(); i++) {
                    int subtotal = jumlahBuah.get(i) * hargaBuah.get(i);
                    total += subtotal;
                    System.out.printf("%-3d %-12s %-8d %-7d %-10d%n", (i + 1), namaBuah.get(i), jumlahBuah.get(i), hargaBuah.get(i), subtotal);
                }

                // Menghitung diskon
                double diskon = total * 0.15;
                double totalBayar = total - diskon;

                System.out.println("========================================");
                System.out.println("Total: " + total);
                System.out.println("Discount (15%): " + (int)diskon);
                System.out.println("Total bayar: " + (int)totalBayar);
            }
        } while (pilihan != 3);

        System.out.println("Terima kasih telah berbelanja!");
    }
}
