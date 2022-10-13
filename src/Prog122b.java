
public class Prog122b {
    public static void main(String[] args) {
        int pay = 4;

        System.out.printf("%-10s%-10s\n", "Hours", "Pay");
        for (int i = 1; i <= 40; i++) {
            System.out.printf("%-10d$%-10d\n", i, i * pay);
        }
    }
}
