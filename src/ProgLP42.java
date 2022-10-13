
import java.util.Scanner;

public class ProgLP42 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String status;

            // Get user input
            System.out.print("Enter weight in kilograms: ");
            double weight = input.nextDouble();
            System.out.print("Enter package length in centimeters: ");
            double length = input.nextDouble();
            System.out.print("Enter package width in centimeters: ");
            double width = input.nextDouble();
            System.out.print("Enter package height in centimeters: ");
            double height = input.nextDouble();
            System.out.println();

            // Check if package meets the requirements
            status = (weight > 27 && length * width * height > 100000) ? "Package is too large and too heavy!"
                    : "Package can be shipped.";
            status = (weight > 27) ? "Package is too heavy!" : status;
            status = (length * width * height > 100000) ? "Package is too large!" : status;

            // Display the results
            System.out.println(status);

      
        }
    }
}
