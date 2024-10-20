public class PolaBagian5 {
    public static void main(String[] args) {
        // Pola bintang (*) dan angka 5
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            for (int k = i; k <= 5; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
