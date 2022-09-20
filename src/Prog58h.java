import java.util.*;

public class Prog58h {
  public static void main(String[] args) { 

  try (Scanner input = new Scanner(System.in)){
      System.out.print("Enter amount saved: ");
      double amSav = input.nextDouble();
      System.out.print("Enter the interest rate: "); 
      double interest = input.nextDouble();
      System.out.print("Enter the times compounded per year : ");
      double tCpY = input.nextDouble();
      System.out.print("Enter the number of days at interest: ");
      double numDAI = input.nextDouble();

      double interestEarned = amSav * (Math.pow((1+ (interest / 100 / tCpY), (tCpY * numDAI / 365))-1));

    double totalAmount = amSav + interestEarned;

    interestEarned = Math.round();
    System.out.println("The interest earned is : $" + interestEarned);
    System.out.println("The total amount is : $"+ totalAmount);
    }
  }
}