public class Prog122i {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s", "Number", "Cube", "Cube Root");
        System.out.println();
        for (int i = -25; i <= 25; i++) {
            System.out.printf("%-10d%-10d%-10.2f", i, i * i * i, Math.cbrt(i));
            System.out.println();
        }


    }
}
