//done
import java.util.*;

public class ProgLP41 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter amount of copies: ");
            int copies = input.nextInt();
            System.out.println();

            double price1 = 0.30;

            // 100-499 copies
            double price2 = 0.28;

            // 500-749 copies
            double price3 = 0.27;

            // 750-999 copies
            double price4 = 0.26;

            // 1000+ copies
            double price5 = 0.25;
            double rate = 0;

            // Do the math
            double total = 0;
            if (copies < 100) {
                total = copies * price1;
                rate = price1;
            } else if (copies < 500) {
                total = copies * price2;
                rate = price2;
            } else if (copies < 750) {
                total = copies * price3;
                rate = price3;
            } else if (copies < 1000) {
                total = copies * price4;
                rate = price4;
            } else {
                total = copies * price5;
                rate = price5;
            }

            // Display the results
            System.out.printf("You ordered %d copies at $%.2f per copy.%n", copies, rate);
            System.out.printf("Total cost: $%.2f", total);
        }

  
    }
}
