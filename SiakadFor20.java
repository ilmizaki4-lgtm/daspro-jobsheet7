import java.util.Scanner;

public class SiakadFor20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai,tertinggi = 0,terendah = 100;
        int lulus=0,tdkLulus=0;
         for (int i = 1; i <= 8; i++) {
              System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
             nilai= sc.nextDouble();
             if (nilai > tertinggi) {
                tertinggi = nilai;
             }
             if (nilai < terendah) {
                terendah = nilai;
             }
            
         }
         System.out.println("nilai tertinggi : " + tertinggi);
         System.out.println("nilai terendah: " + terendah);
    }
}