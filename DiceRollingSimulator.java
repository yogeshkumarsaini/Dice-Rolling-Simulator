import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DiceRollingSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        List<String> history = new ArrayList<>();
        System.out.println("🎲 Welcome to Multi-Dice Rolling Simulator!");

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1️⃣ Roll Dice");
            System.out.println("2️⃣ Show History");
            System.out.println("3️⃣ Quit");

            System.out.print("Enter choice (1/2/3): ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Enter number of dice to roll: ");
                int numDice = scanner.nextInt();

                StringBuilder result = new StringBuilder("Rolled: ");
                for (int i = 0; i < numDice; i++) {
                    int diceValue = random.nextInt(6) + 1;
                    result.append(diceValue).append(" ");
                }

                String rollResult = result.toString().trim();
                System.out.println(rollResult);
                history.add(rollResult);
            } 
            else if (option == 2) {
                System.out.println("\n📜 Roll History:");
                if (history.isEmpty()) {
                    System.out.println("No rolls yet!");
                } else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
            } 
            else if (option == 3) {
                System.out.println("Thanks for playing! Goodbye 👋");
                break;
            } 
            else {
                System.out.println("Invalid option! Try again.");
            }
        }

        scanner.close();
    }
}
