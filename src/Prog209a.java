
import java.util.*;
import java.io.*;

public class Prog209a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog215a.dat"));
            List<Integer> greater = new ArrayList<>();
            List<Integer> less = new ArrayList<>();
            while (input.hasNext()) {
                int num = input.nextInt();
                if (num < 500)
                    less.add(num);
                else
                    greater.add(num);
            }
            System.out.printf("Numbers >= to 500: %d%nNumbers < 500: %d%nTotal numbers %d", greater.size(), less.size(),
                    greater.size() + less.size());
        } catch (IOException e) {
            System.out.print("File not found.");
        }

    }
}
