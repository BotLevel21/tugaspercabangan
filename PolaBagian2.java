public class PolaBagian2 {
    public static void main(String[] args) {
        // Pola angka dengan peningkatan dari baris ke baris
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= i + 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
