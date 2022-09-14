import java.util.*;

public class Prog58b {

    public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter a, b, c : ");
      double a = input.nextDouble();
      double b = inpit.nextDouble();
      double c = input.nextDouble();

      double discriminant = Math.pow(b, 2) - 4 * a * c; 

      double 1root = (-b + Math.pow(discriminat, 0.5)) / (2* a);
      double 2root = (-b + Math.pow(discriminat,0.5)) / (2 * a);


      System.out.println();
      System.out.println("The roots are : " + 1root + ", " + 2root);

      } 
    } 
