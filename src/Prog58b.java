import java.util.*;

public class Prog58b {

  public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter a, b, c : ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();

      double discriminant = Math.pow(b, 2) - 4 * a * c; 

      double root1 = (-b + Math.pow(discriminant, 0.5)) / (2* a);
      double root2 = (-b + Math.pow(discriminant,0.5)) / (2 * a);


      System.out.println();
      System.out.println("The roots are : " + root1 + ", " + root2);

      } 
    }
}
