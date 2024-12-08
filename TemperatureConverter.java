import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        int choice = 0;
        while (true) {
            System.out.print("Enter 1 or 2: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break; 
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }
        }

        double temperature = 0.0;
        while (true) {
            System.out.print("Enter the temperature: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break; 
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); 
            }
        }

        if (choice == 1) {
            
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f°C is equivalent to %.2f°F.%n", temperature, fahrenheit);
        } else {
            
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f°F is equivalent to %.2f°C.%n", temperature, celsius);
        }

        scanner.close();
        System.out.println("Thank you for using the Temperature Converter!");
    }
}
