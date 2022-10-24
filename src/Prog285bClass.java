//done
import java.util.Scanner;
import java.io.*;

public class Prog285bClass {
  public static void main(String [] args) {
    try {
      Scanner input = new Scanner(new File("data/prog285b.dat"));

      while (input.hasNext()) {
        int id = input.nextInt();
        int c = input.nextInt();
        double s = input.nextDouble();

        SalesPerson fred = new SalesPerson(id, c, s);

      }
    }catch (IOException e){
      System.out.println("Can't find data file!");
      
    }
      }
    }
    
  }
  
}