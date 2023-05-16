package bullscows;
// maybe all this comments will help u :)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Grader(randomGenerator());
    }

    public static String randomGenerator() {
        StringBuilder LastChance = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the secret code's length:");
        String inputLength = scanner.nextLine();
        int length = 0;
        try {
            length = Integer.parseInt(inputLength);
            if (length<1) {
                throw new IllegalArgumentException("error: it's not possible to generate a code with a length of "+length);
            }
        } catch (NumberFormatException ex) {
            System.out.println("error, should be an integer");
            System.exit(0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            System.exit(0); }
        System.out.println("Input the number of possible symbols in the code:");
        String inputDifficult = scanner.nextLine();
        int difficult = 0;
        try {
            difficult = Integer.parseInt(inputDifficult);
            if(difficult<length|difficult>=37) {
                throw new IllegalArgumentException("error: it's not possible to generate a code with a length of "+length+" with "+ difficult +" unique symbols.");
            }
        } catch (NumberFormatException ex) {
            System.out.println("error, should be an integer");
            System.exit(0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }

        char[] random = new char[length];
        List<Character> randomList = new ArrayList<>(List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')); //didn't get this carefully, but it works: we have array of all numbers
        List<Character> setDifficult =  new ArrayList<>(randomList.subList(0, difficult)); //didn't get this carefully, but it works: we have array of all numbers
        Collections.shuffle(setDifficult); //shuffle them, as u see
        while (setDifficult.get(0) == 0) { //check if there is 0 at (0) position
            Collections.shuffle(setDifficult); //reshuffle them, if first number is zero
        }
        for (int i = 0; i < length; i++) { //takes length, and assign numbers for int[]array
            random[i] = setDifficult.get(i);
        }
        LastChance = new StringBuilder(Arrays.toString(random).replaceAll("[^\\p{Alnum}]", ""));

        if (difficult <= 10) {
            System.out.println("The secret is prepared: " + "*".repeat(length) + " (0-" +randomList.get(difficult-1)+")");
        } else {
            System.out.println("The secret is prepared: " + "*".repeat(length) + " (0-9, a-" +randomList.get(difficult-1)+")");
        }

        System.out.println("Okay, let's start a game!");
        String secretCode = LastChance.toString(); //there's I just don't want to change parameter
        System.out.println(secretCode);
        return secretCode;
    }

    public static void Grader(String secretCode) {
        for (;;){
            Scanner scanner = new Scanner(System.in);
            for(int turn =1;;turn++){
                int cows = 0; //right num in wrong place  counter
                int bulls = 0; //right num in right place counter
                System.out.println("Turn "+turn+":");
                String niceTry = scanner.nextLine(); //users input
                try {
                    for (int i = 0; i < secretCode.length(); i++) { //get users suggestion (cows)
                        String forCowsCheck = String.valueOf(niceTry.charAt(i));
                        if (secretCode.charAt(i) == niceTry.charAt(i)) {
                            bulls++;
                        } else if (secretCode.contains(forCowsCheck)) {
                            cows++;
                        }
                    }
                } catch (Exception q) {
                    System.out.println("error, input should conclude "+secretCode.length()+"chars");
                }
                if (bulls == secretCode.length()){
                    System.out.println("Grade: " + bulls + " bull(s)");
                    System.out.println("Congratulations! You guessed the secret code.");
                    return;//return breaking all method, that's a point
                }
                else if (cows == 0 && bulls == 0) {
                    System.out.println("Grade: None.");
                } else if (cows != 0 && bulls == 0) {
                    System.out.println("Grade: " + cows + " cow(s)");
                } else if (cows == 0 && bulls != 0) {
                    System.out.println("Grade: " + bulls + " bull(s)");
                } else {
                    System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow(s)");
                }

            }

        }
    }
}