import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    
    System.out.println("Enter any whole number: ");
    int number1 = myObj.nextInt();  
    
    System.out.println("Enter another whole number: ");
    int number2 = myObj.nextInt();

    System.out.println("Enter one more whole number: ");
    int number3 = myObj.nextInt();

    int sum = number1 + number2 + number3;
    int av = ((number1 + number2 + number3)/3);
    
      
    System.out.println("The sum of your numbers are " + sum);  // Output user input
    System.out.println("The average of your numbers is : " + av);
    
      
   
  }
}
