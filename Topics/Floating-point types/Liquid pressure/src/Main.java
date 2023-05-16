import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // put your code here
        double g = 9.8;
        double p = scanner.nextDouble();
        double h = scanner.nextDouble();
        double result = p * g * h;;
        System.out.print(result);
    }
}