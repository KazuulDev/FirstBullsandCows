import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());

        int sumA = (a/2)+(a%2);
        int sumB = (b/2)+(b%2);
        int sumC = (c/2)+(c%2);

        System.out.println(sumA+sumB+sumC);

    }
}