import java.util.Scanner;

public class Prog72t {

  public static void main(String[]args) {
    try (
      Scanner input = new Scanner(System.in)) {
      System.out.print("Enter the first time ");
      int time1 = input.nextInt();
      System.out.print("Enter the second time ");
      int time2 = input.nextInt();

      if (time1> 2400 || time2 > 2400) System.out.println("Invalid Output");

      time2 += (time1 > time2) ? 2400 : 0;

      int time1h = time1/ 100;
      int time1m = time1 % 100;
      int time2h = time2 / 100;
      int time2m = time2 % 100;

      int time3h = Math.abs(time2h - time1h);
      int time3m = Math.abs(time2m - time1m);

      System.out.printf("The difference betweem two times is %d hours and %d minutes", time3h, time3m);
      
    }
  }
}