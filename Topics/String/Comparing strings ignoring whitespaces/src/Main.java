import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String first = scanner.nextLine();
        first = (first.replaceAll(" ",""));

        String second = scanner.nextLine();
        second = second.replaceAll(" ","");



        System.out.println (first.equals(second));
    }
}