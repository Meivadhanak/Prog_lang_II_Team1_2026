/*public class Calculator {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java Calculator <operation> <num1> <num2>");
            return;
        }

        String operation = args[0];
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);
        double result = 0;

        switch (operation) {
            case "add":
                result = num1 + num2;
                break;

            case "subtract":
                result = num1 - num2;
                break;

            case "multiply":
                result = num1 * num2;
                break;

            case "divide":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operation. Use add, subtract, multiply, or divide.");
                return;
        }

        System.out.println("Result: " + result);
    }
}*/

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = rand.nextInt(100) + 1;
        int guess = 0;

        while (guess != number) {
            System.out.print("Enter your guess (1-100): ");
            guess = scanner.nextInt();

            if (guess < number) {
                System.out.println("Larger!");
            } else if (guess > number) {
                System.out.println("Smaller!");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }

        scanner.close();
    }
}