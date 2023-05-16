import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int firstDigit = number / 10;

        System.out.println(firstDigit);
    }
}
