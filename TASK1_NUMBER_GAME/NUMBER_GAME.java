import java.util.Random;
import java.util.Scanner;

public class NUMBER_GAME {

    public static void playGame(int min, int max, int maxAttempts) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(max - min + 1) + min;
        int attempts = 0;
        boolean hasGuessed = false;

        System.out.println("\nGuess the number between " + min + " and " + max);

        while (attempts < maxAttempts && !hasGuessed) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                hasGuessed = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }

        if (!hasGuessed) {
            System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
        }
    }

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        int min = 1, max = 100, maxAttempts = 5;
        int totalRounds = 0, totalWins = 0;

        while (true) {
            totalRounds++;
            playGame(min, max, maxAttempts);

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();

            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Starting a new round...");
            } else {
                System.out.println("\nGame Over!");
                break;
            }
        }

        System.out.println("Total Rounds Played: " + totalRounds);
        System.out.println("Rounds Won: " + totalWins);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Guess the Number' Game!");

        startGame();
    }
}