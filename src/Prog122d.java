public class Prog122d {
    public static void main(String[] args) {
        double y;
        System.out.printf("%-10s%-10s%n", "x", "y");
        for (int x = -12; x <= 16; x++) {
            y = Math.pow(x, 6) - 3 * Math.pow(x, 5) - 93 * Math.pow(x, 4) + 87 * Math.pow(x, 3) + 1596 * Math.pow(x, 2)
                    - (1380 * x) - 2800;
            System.out.printf("%-10d%-10.0f%n", x, y);
        }

    }
}
