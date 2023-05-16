import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short zxc = scanner.nextShort();
        if (zxc % 2 == 0) {
            zxc += 2;
        }
        else {
            zxc += 1;
        }
        System.out.println(zxc);
    }
}