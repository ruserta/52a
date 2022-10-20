
import java.util.*;


public class ProgLP517 {
  public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
     
          String pswd = "123";
            
          
            
        System.out.println("Welcome.");    
              System.out.println("What is your password?");
                

            
              for (int i = 0;i < 3; i++){
            String pswdtry = input.nextLine();
                  if (pswdtry.equals(pswd))
              {
              System.out.println("Welcome!");
                System.exit(1);
              }
            else {
                  System.out.println("The password you typed is incorrect");
            }
          }
              System.out.println("Access Denied.");
        }
      }


  


  
    }






























  //fuck you