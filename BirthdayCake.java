/*import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current temperature: ");
        double temperature = scanner.nextDouble();

        if (temperature < 0) {
            System.out.println("Below freezing");
        } else if (temperature < 30) {
            System.out.println("Average");
        } else {
            System.out.println("Too hot");
        }

        scanner.close();
    }
}*/

/*import java.util.Scanner;

public class LightningDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double seconds;

        do {
            System.out.print("How many seconds after the lightning did you hear the thunder? ");
            seconds = scanner.nextDouble();

            if (seconds < 0) {
                System.out.println("Time cannot be negative. Please enter a valid value.");
            }

        } while (seconds < 0);

        double speedOfSound = 300; 
        double distance = seconds * speedOfSound;

        System.out.println("The lightning struck approximately " + distance + " meters away.");

        scanner.close();
    }
}*/

import java.util.Scanner;

public class BirthdayCake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        do {
            System.out.print("How old are you? (between 1-20): ");
            age = scanner.nextInt();

            if (age < 1 || age > 20) {
                System.out.println("Invalid age. Please enter a number between 1 and 20.");
            }

        } while (age < 1 || age > 20);

        for (int i = 0; i < age; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 0; i < age; i++) {
            System.out.print("| ");
        }
        System.out.println();

        for (int i = 0; i < age * 2; i++) {
            System.out.print("-");
        }

        scanner.close();
    }
}
