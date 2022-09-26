import java.util.*;

public class Prog93a {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter kilowatts used: ");
    int kw = input.nextInt();
    double base = kw * 4.75;
    double surcharge = kw * .10;
    double tax = base * .03;

    System.out.printf("Kilowatts used : %d%n", kw);

}