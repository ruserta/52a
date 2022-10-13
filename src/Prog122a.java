
public class Prog122a {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%n", "Number", "Square", "Square Root");
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%-10d%-10d%-10.4f%n", i, i * i, Math.sqrt(i));
        }


    }
}
