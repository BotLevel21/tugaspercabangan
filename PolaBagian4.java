public class PolaBagian4 {
    public static void main(String[] args) {
        // Pola S dan 0
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j % 2 == 1) {
                    System.out.print("S ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
