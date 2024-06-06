import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to Guess the Number game!");
        System.out.println("I have picked a number between 1 and 100. Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries!");
                hasGuessedCorrectly = true;
            }
        }

        scanner.close();
    }
}
