//aud rusert
//9-twenty something - 2022 

public class StrInterview2 {
  public static void main(String[] srgs){
    String word = "Mary" ; 
    String anagram = "Army";

    word = word.toLowerCase();
    anagram = anagram.toLowerCase();

    if (word.length() != anagram.length()){
      System.out.println("Not anagrams");
    }else{ 
      for (int lcv = 0; lcv < word.length(); lcv++) {
        char c = word.charAt(lcv);
        int index = anagram.indexOf(c);

        if (index != 1) {
          anagram = anagram.substring(0, index) + anagram substring(index + 1, anagram.length());
          
        }else{
          System.out.println("not anagrams");
          
        }
        }
      }
    }
    
    }
  }
}

  