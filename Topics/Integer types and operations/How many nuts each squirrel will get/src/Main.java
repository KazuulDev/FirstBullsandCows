import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = Short.parseShort(scanner.next());
        short k = Short.parseShort(scanner.next());
        short nuts = (short) (k/n);
        System.out.println(nuts);
    }
}