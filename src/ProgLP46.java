//done
import java.util.*;

public class ProgLP46 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String out;

            // make 2 random nums 1 - 10
            int num1 = (int) (Math.random() * 10) + 1;
            int num2 = (int) (Math.random() * 10) + 1;

            // ask user to multiply them
            System.out.printf("What is %d * %d? ", num1, num2);
            int answer = input.nextInt();

            // check if answer is correct
            out = (answer == num1 * num2) ? "Correct!" : "Incorrect!";
            System.out.print(out);
        }
    }
   
}
