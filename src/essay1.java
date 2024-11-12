import java.util.Scanner;

public class essay1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print("Semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine(); // consume newline

        int totalSKS = 0;
        double totalNilai = 0.0;
        int jumlahMataKuliah = 4; // Asumsi jumlah mata kuliah yang diambil adalah 4
        String[] namaMataKuliah = new String[jumlahMataKuliah];
        int[] sksMataKuliah = new int[jumlahMataKuliah];
        char[] nilaiMataKuliah = new char[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = scanner.nextLine();

            System.out.print("Jumlah SKS: ");
            sksMataKuliah[i] = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Nilai (A, B, C, D, atau E): ");
            nilaiMataKuliah[i] = scanner.next().charAt(0);
            scanner.nextLine(); // consume newline
        }

        System.out.println("\nTabel Mata Kuliah:");
        System.out.println("Mata Kuliah\tSKS\tNilai\tBobot");

        for (int i = 0; i < jumlahMataKuliah; i++) {
            int bobot = 0;
            switch (nilaiMataKuliah[i]) {
                case 'A': bobot = 4; break;
                case 'B': bobot = 3; break;
                case 'C': bobot = 2; break;
                case 'D': bobot = 1; break;
                case 'E': bobot = 0; break;
            }
            System.out.println(namaMataKuliah[i] + "\t" + sksMataKuliah[i] + "\t" + nilaiMataKuliah[i] + "\t" + bobot);
            totalSKS += sksMataKuliah[i];
            totalNilai += sksMataKuliah[i] * bobot;
        }

        double rataRataNilai = totalNilai / totalSKS;
        System.out.println("Total SKS yang diambil: " + totalSKS);
        System.out.printf("Nilai rata-rata: %.2f\n", rataRataNilai);
    }
}
