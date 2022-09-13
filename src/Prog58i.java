import java.util.*;
public class Prog58i {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("The amount I wish to borrow is $");
  double p = input.nextDouble();

    System.out.print("The loan rate is ");
    double r = input.nextDouble();

    System.out.print("The number of months it will take me to pay off the loan is ");
    double m = input.nextDouble();
    System.out.println();
    
    double mp = p*((r/1200)*(Math.pow(m,(1+(r/1200)))/(Math.pow(m,(1+(r/1200)))-1)));

    System.out.printf("My monthly payments will be $%.2f\n", mp);
    System.out.printf("The total intrest paid is $%.2f\n", mp * m);
    System.out.printf("The total amount paid is $%.2f\n", (mp * m)+p);
    
  }
  
}
