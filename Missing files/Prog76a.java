
import java.util.Scanner;

public class Prog76a {
    public static void main(String[] args) {
        // get disliked number
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a disliked number 1 - 9: ");
            int dislikedNumber = input.nextInt();
            System.out.println();

            // do math
            int number1 = dislikedNumber * 9;
            int number2 = number1 * 12345679;

            // output equation
            System.out.println(dislikedNumber + " * 9 = " + number1);
            System.out.println(number1 + " * 12345679 = " + number2);
        }

    }
}
