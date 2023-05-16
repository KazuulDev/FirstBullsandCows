import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int minMax = Integer.MAX_VALUE;
        int bestSeed = -1;

        for (int seed = A; seed <= B; seed++) {
            Random random = new Random(seed);
            int max = -1;

            for (int i = 0; i < N; i++) {
                int randomNumber = random.nextInt(K);
                max = Math.max(max, randomNumber);
            }

            if (max < minMax) {
                minMax = max;
                bestSeed = seed;
            }
        }

        System.out.println(bestSeed);
        System.out.println(minMax);
    }
}
