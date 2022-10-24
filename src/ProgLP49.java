//done
import java.util.Scanner;

public class ProgLP49 {
    public static void main(String[] args) {
        boolean playing = true;

        try (Scanner input = new Scanner(System.in)) {
            while (playing) {

                System.out.print("Enter a number 1 - 20: ");
                int guessed = input.nextInt();

                // Generate random number
                int generated = (int) (Math.random() * 20) + 1;

                // Check user input
                if (guessed == generated) {
                    System.out.printf("Correct!%nYou guessed: %d%nComputer generated number: %d", guessed, generated);
                    playing = false;
                } else {
                    System.out.printf("Nope... try again. Computer generated number was: %d%n", generated);
                }
            }
        }
        
    }
}
