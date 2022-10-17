
import java.util.Scanner;

public class StrInterview7 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter a String: ");
    String myText = keyboard.nextLine();

    int vowelCount = 0;
    for (int lcv = 0; lcv < myText.length(); lcv++) {
      char cur = myText.charAt(lcv);
      if (cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u')
        vowelCount++;

    }

    int conscount = myText.length() - vowelCount;
    System.out.printf(" # Vowels : %d\t\t# Consonants: %d\n", vowelCount, conscount);

  }
}