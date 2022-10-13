import java.util.Scanner; 

public class Prog65h {
  public static void main(string[] args) {

    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter pounds: ");
      double pounds = input.nextDouble();
      System.out.print("Enter shillings: ");
      double shillings = input.nextDouble();
      System.out.print("Enter pence: ");
      double pence = input.nextDouble();
      System.out.println();

      double decimalPounds = pounds + shillings / 20 + pence /240; 

      decimalPounds = Math.round(deciamlPounds * 100) / 100;
      System.out.println("Decimal pounds: " + decimalPounds);
    }
  }
}