public class Prog122h {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s", "Number", "Square", "Square root", "Cube", "4th root");
        System.out.println();
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%-10d%-10d%-10.4f%-10d%-10.4f", i, i * i, Math.sqrt(i), i * i * i, Math.pow(i, 0.25));
            System.out.println();
        }    


    }
}
