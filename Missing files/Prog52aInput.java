import java.util.*;

public class Prog52aInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length: ");
        int len = input.nextInt();
        System.out.println();

        System.out.print("Please enter the width: ");
        int wid = input.nextInt();
        System.out.println();

        int area = len * wid;
        int perim = 2 * len + 2 * wid;
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perim);
    }
}

