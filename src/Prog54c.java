import java.util.*;

public class Prog54c {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter the radius of cicle : ");
      double radius = input.nextDouble();

      // do math
      double area = Math.PI * Math.pow(radius, 2);
      double circum = 2 * Math.PI * radius;

      // round to 3 decimal places
      area = Math.round(area * 1000);
      circum = Math.round(circum * 1000) / 1000.0;

      System.out.println();
      System.out.println("The radius is : " + radius);
      System.out.println("The area is : " + area);
      System.out.println("The circumference us : " + circum);
    }
  }
}
