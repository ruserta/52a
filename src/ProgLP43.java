//done
import java.util.Scanner;

public class ProgLP43 {
        public static void main(String[] args) {
                try (Scanner input = new Scanner(System.in)) {

                        System.out.print("Number of eggs to purchase: ");
                        int eggs = input.nextInt();

                        // Set pricepoint for range of dozen
                        double price1 = 0.50; // 0 - 3 dozen
                        double price2 = 0.45; // 4 - 5 dozen
                        double price3 = 0.40; // 6 - 10 dozen
                        double price4 = 0.35; // 11+ dozen

                        // Get dozens and extras
                        int dozenCount = eggs / 12;
                        int extraCount = eggs % 12;

                        // Do the math
                        double total;
                        double extra;

                        total = (dozenCount < 4) ? dozenCount * price1
                                        : (dozenCount < 6) ? dozenCount * price2
                                                        : (dozenCount < 11) ? dozenCount * price3
                                                                        : dozenCount * price4;

                        // Set extra to 1/12 of cost per dozen
                        extra = (dozenCount < 4) ? price1 / 12
                                        : (dozenCount < 6) ? price2 / 12
                                                        : (dozenCount < 11) ? price3 / 12
                                                                        : price4 / 12;

                        // Add extra to total
                        total += extra * extraCount;

                        // Display the results
                        System.out.printf(
                                        "You ordered %d dozen and %d eggs at $%.2f per dozen and $%.2f per extra egg for a total of $%.2f.%n",
                                        dozenCount, extraCount, price1, extra, total);
                }

               
        }
}