import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe, toplamTutar, birimFiyat = 2.2;
        int minTutar = 20;
        int acilisFiyat = 10;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen mesafeyi giriniz : ");
        mesafe = scan.nextDouble();

        toplamTutar = (mesafe*birimFiyat)+acilisFiyat;

        toplamTutar = (toplamTutar<minTutar) ? minTutar : toplamTutar;

        System.out.println("Toplam Tutar : " + toplamTutar);
    }
}