
import java.util.*;

public class Prog93a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of kilowatt hours used: ");
        double kWh = input.nextDouble();
        input.close();

     
        double bill = kWh * 0.0475;
        double surcharge = bill * 0.1;
        double tax = bill * 0.03;
        double late = (bill + surcharge + tax) * 0.04;
        double total_if_late = bill + surcharge + tax + late;


        bill = Math.round(bill * 100.0) / 100.0;
        surcharge = Math.round(surcharge * 100.0) / 100.0;
        tax = Math.round(tax * 100.0) / 100.0;
        late = Math.round(late * 100.0) / 100.0;
        total_if_late = Math.ceil(total_if_late * 100.0) / 100.0;


        System.out.println("Electricity Bill");
        System.out.println("Kilowatt hours used: " + kWh);
        System.out.println("Amount billed: $" + bill);
        System.out.println("Surcharge: $" + surcharge);
        System.out.println("City utility tax: $" + tax);
        System.out.println("Total bill: $" + (bill + surcharge + tax));
        System.out.println();
        System.out.println("After May 20th pay: $" + total_if_late);



    }
}
