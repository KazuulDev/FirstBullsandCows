import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String arr = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++){
            System.out.print(arr.charAt(i));
        }
    }
}