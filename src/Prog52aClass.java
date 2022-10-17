import java.util.Scanner;

public class Prog52aClass {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);

    System.out.print("Please enter length: ");
    int len = kbd.nextInt();
    System.out.print("Please enter width: ");
    int wid = kbd.nextInt();
    System.out.println();

    // make a new object (instance) of cl52a (instantiate the class)
    cl52a wow = new cl52a(len, wid);

    wow.setStuff();

    int area = wow.getArea();
    int perim = wow.getPerim();

    System.out.println("Area" + area);
    System.out.println("Perim:" + perim);

  }
}