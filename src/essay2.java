public class essay2 {
    public static void main(String[] args) {
        int gajiBulanan = 7500000;
        int jamLembur = 6; 
        int upahLemburPerJam = gajiBulanan / 150;
        int upahLembur;
        if (jamLembur <= 5) {
            upahLembur = jamLembur * upahLemburPerJam;
        } else {
            upahLembur = (5 * upahLemburPerJam) + ((jamLembur - 5) * upahLemburPerJam * 3 / 2);
        }
        int totalGaji = gajiBulanan + upahLembur;
        
        System.out.println("Gaji Pokok Bulanan: " + gajiBulanan);
        System.out.println("Jam Lembur: " + jamLembur);
        System.out.println("Upah Lembur per Jam: " + upahLemburPerJam);
        System.out.println("Upah Lembur: " + upahLembur);
        System.out.println("Total Gaji yang Diberikan: " + totalGaji);
    }
}
