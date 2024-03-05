import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        int minYakin = Integer.MAX_VALUE;
        int maxYakin = Integer.MIN_VALUE;

        for (int i : list) {
            if (i < girilenSayi && girilenSayi - i < Math.abs(girilenSayi - minYakin)) {
                minYakin = i;
            }
            if (i > girilenSayi && i - girilenSayi < Math.abs(girilenSayi - maxYakin)) {
                maxYakin = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + minYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + maxYakin);

        // Scanner'ı kapatmayı unutmayın.
        scanner.close();
    }
}
