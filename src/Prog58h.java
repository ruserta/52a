import java.util.*;

public class Prog58h {
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter amount saved: ");
      double amSav = input.nextDouble();
      System.out.print("Enter the interest rate: ");
      double interest = input.nextDouble();
      System.out.print("Enter the times compounded per year : ");
      double tCpY = input.nextDouble();
      System.out.print("Enter the number of days at interest: ");
      double numDAI = input.nextDouble();

      double interestEarned = amSav * (Math.pow(1 + ((0.1 * (interest) / tCpY)), (tCpY * numDAI) / 365));

      double totalAmount = amSav + interestEarned;

      // interestEarned = Math.round(interestEarned);
      System.out.printf("Interest earned: $%.2f", interestEarned);
      System.out.println();
      System.out.printf("Total amount earned: $%.2f", totalAmount); // printf("%.2f", variableName)
      System.out.println();
    }
  }
}