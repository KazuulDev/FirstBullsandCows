import java.util.Scanner;

class ReversingDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Extracting the digits
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        // Reversing the digits
        int reversedNumber = digit3 * 100 + digit2 * 10 + digit1;

        System.out.println(reversedNumber);
    }
}
