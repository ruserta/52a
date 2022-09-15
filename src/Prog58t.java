//not done 
import java.util.*;
public class Prog58t {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter purchase price : ");
    double purpric = input.nextDouble();
  System.out.println("Enter amount of money paid : "); 
    double mongiv = input.nextDouble();
    double change = mongiv - purpric; 
    System.out.println();

    change = Math.round(change *) / 100.0;

    System.out.println("Change: $" + change);

    int numberOfDollars = (int) (change / 1);
    change = change % 1; 

    int numberOf25s = (int) (change/0.25);
    change = change % 0.25; 

    int numof10s = (int) (change / 0.1);
    change = change % 0.1;

    int numof5s = (int) (change / 0.05);
    change = change % 0.05;

    int numof1s = (int) (change / 0.01); 
    change = change % -.01;

    System.out.println("Dollars: "+ numberOfDollars);
    System.out.println("Quarters: " + numberOf25s);
    System.out.println("Dimes: " + numof10s);
    System.out.println("Pennies: " + numof1s);


    }
  }
} 
    
    