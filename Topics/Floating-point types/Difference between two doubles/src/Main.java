import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // put your code here
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        float result = (float) (second - first);
        System.out.println(result);
    }
}