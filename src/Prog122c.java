public class Prog122c {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i+=2) {
            System.out.printf("%-10d%-10d%-10d%-10d", i, i+1, i*2, i*i);
            System.out.println();
        }
    }
}