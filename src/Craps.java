import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create a Random object to generate random numbers for the dice rolls
        Random random = new Random();

        // Start an infinite loop for the game
        while (true) {
            // Roll two dice and calculate their total
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            int total = dice1 + dice2;

            // Print the result of the dice roll to the console
            System.out.printf("You rolled %d + %d = %d%n", dice1, dice2, total);

            // Checking to see if the player won or lost
            if (total == 7 || total == 11) {
                System.out.println("You win!");
            } else if (total == 2 || total == 3 || total == 12) {
                System.out.println("You lose!");
            } else {
                // If the total is anything else, enter the point
                int point = total;
                System.out.printf("Point is %d%n", point);

                // Start a new loop for the point phase
                while (true) {
                    // Roll the dice again and tally up the points
                    dice1 = random.nextInt(6) + 1;
                    dice2 = random.nextInt(6) + 1;
                    total = dice1 + dice2;

                    // Print result of the dice roll
                    System.out.printf("You rolled %d + %d = %d%n", dice1, dice2, total);

                    // Check if the player won or lost based on the new total value
                    if (total == point) {
                        System.out.println("You win!");
                        break;
                    } else if (total == 7) {
                        System.out.println("You lose!");
                        break;
                    }
                }
            }

            // Ask the player if they want to play again
            System.out.print("Play again? (y/n): ");
            String playAgain = input.nextLine();

            // If the player does not want to play again, exit the game
            if (!playAgain.equalsIgnoreCase("y")) {
                break;
            }
        }

        // Close the Scanner object to free resources
        input.close();
    }
}
