

import java.util.*;

public class ProgLP410 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Get rectangular prism input
            System.out.println("Rectangular Prism");
            System.out.print("Enter length of rectangular prism: ");
            double length = input.nextDouble();
            System.out.print("Enter width of rectangular prism: ");
            double width = input.nextDouble();
            System.out.print("Enter height of rectangular prism: ");
            double height = input.nextDouble();

            // Output rectangular prism volume
            double volume = length * width * height;
            System.out.printf("Volume of rectangular prism: %.2f%n", volume);
            System.out.println();

            // Get sphere input
            System.out.println("Sphere");
            System.out.print("Enter radius of sphere: ");
            double radius = input.nextDouble();

            // Output sphere volume
            double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            System.out.printf("Volume of sphere: %.2f%n", sphereVolume);
            System.out.println();

            // Get cube input
            System.out.println("Cube");
            System.out.print("Enter length of each side: ");
            double cubeLength = input.nextDouble();

            // Output cube volume
            double cubeVolume = Math.pow(cubeLength, 3);
            System.out.printf("Volume of cube: %.2f%n", cubeVolume);
        }



    }
}
