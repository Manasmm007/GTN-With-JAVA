import java.util.Random;

public class GuessTheNumber {
    public static String main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int numberOfTries = 0;

        while (true) {
            int guess = Integer.parseInt(args[0]);
            numberOfTries++;

            if (guess < numberToGuess) {
                return "Too low! Try again.";
            } else if (guess > numberToGuess) {
                return "Too high! Try again.";
            } else {
                return "Congratulations! You've guessed the number in " + numberOfTries + " tries!";
            }
        }
    }
}
