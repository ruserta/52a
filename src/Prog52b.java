
import java.util.Scanner;


public class Prog52b {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter any whole number: ");
        double number1 = myObj.nextDouble();

        System.out.println("Enter another whole number: ");
        double number2 = myObj.nextDouble();

        System.out.println("Enter one more whole number: ");
        double number3 = myObj.nextDouble();

        System.out.println("Enter one more whole number: ");
        double number4 = myObj.nextDouble();

        double sum = number1 + number2 + number3 + number4;
        double av = ((number1 + number2 + number3 + number4)/4);


        System.out.println("The sum of your numbers are " + sum);  // Output user input
        System.out.println("The average of your numbers is : " + av);



    }
}

/*
Enter any whole number:
475
Enter another whole number:
821
Enter one more whole number:
369
Enter one more whole number:
562
The sum of your numbers are 2227.0
The average of your numbers is : 556.75

 */
