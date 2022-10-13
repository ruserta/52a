
import java.util.*;

public class Prog82a {
    public static void main(String[] args) {
      
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter speed limit: ");
            int speedLimit = input.nextInt();
            System.out.print("Enter speed of car: ");
            int speed = input.nextInt();
            System.out.println();

            double fine = 20 + (speed - speedLimit) * 5;

            if (speed > speedLimit) {
             
                System.out.println("Speed limit: " + speedLimit);
                System.out.println("Speed of car: " + speed);
                System.out.println("Fine: $" + fine);
            } else {
        
                System.out.println("You are within the speed limit!");
            }
        }

    }
}
