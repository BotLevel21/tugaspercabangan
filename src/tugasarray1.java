import java.util.Scanner;

public class tugasarray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta jumlah data
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline
        
        // Deklarasi array untuk menyimpan data mahasiswa
        String[] namaMahasiswa = new String[jumlahData];
        int[] nilaiMahasiswa = new int[jumlahData];
        int totalNilai = 0;
        
        // Menginput data mahasiswa
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("________________________________");
            System.out.println("Mahasiswa Ke : " + (i + 1));
            
            System.out.print("Nama: ");
            namaMahasiswa[i] = scanner.nextLine();
            
            System.out.print("Nilai: ");
            nilaiMahasiswa[i] = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
            
            totalNilai += nilaiMahasiswa[i];
        }
        
        // Menampilkan daftar nilai
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No  Nama        Nilai  Status");
        
        // Menentukan status dan menampilkan data
        for (int i = 0; i < jumlahData; i++) {
            String status = (nilaiMahasiswa[i] >= 60) ? "Lulus" : "Tidak Lulus";
            System.out.printf("%-4d%-12s%-7d%s%n", (i + 1), namaMahasiswa[i], nilaiMahasiswa[i], status);
        }
        
        // Menghitung rata-rata
        double rataRata = (double) totalNilai / jumlahData;
        
        // Menampilkan hasil total dan rata-rata
        System.out.println("================================");
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRata);
    }
}

