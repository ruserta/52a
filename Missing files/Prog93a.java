import java.util.*;

public class Prog93a {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter kilowatts used: ");
    double kw = input.nextDouble();
    double base = kw * 0.0475;
    double surcharge = kw * .10;
    double tax = base * .03;
    double total = base + surcharge + tax;
    double late = (base + surcharge + tax) * 0.04;
    
    base = Math.round(base * 100.0) / 100;
    surcharge = Math.round(surcharge * 100.0)/ 100.0;
    tax = Math.round(late * 100.0)/ 100.0;
    late = Math.round(late * 100.0)/100.0;
    totalLate = Math.ceil(late * 100.0)/100.0;

    System.out.printf("Kilowatts used : %d%n", kw);
    System.out.println("Base rate : " + base);
    System.out.println("Surcharge: "+ surcharge);
    System.out.println("Tax: " + tax);
    System.out.println("Total: " + total);
  }
}