public class Prog88a {
  public static void main(String[] args) {
    int number1 = (int) (Math.random() * 13) + 1;
    int number2 = (int) (Math.random() * 19) + 1;

    int sum = number1 + number2;
    int difference = number1 - number2;
    int product = number1 * number2;
    double average = (number1 + number2) / 2.0;
    int distance = Math.abs(number1 - number2);

    int min = number1;
    int max = number1;
    if (number2 > max) {
      max = number2;
    }
    if (number2 < min) {
      min = number2;
    }

    System.out.println("Num1: " + number1);
    System.out.println("Num2: " + number2);
    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Avereage: " + average);
    System.out.println("Distance: " + distance);

    /*
     * Num1: 4
     * Num2: 15
     * Sum: 19
     * Difference: -11
     * Product: 60
     * Avereage: 9.5
     * Distance: 11
     */
  }
}