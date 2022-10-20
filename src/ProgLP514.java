public class ProgLP514 {
  public static void main(String [] args){
    System.out.println("Die1Die2Sum");
    for (int i = 0; i< 5; i++){
      int die1 = (int)(Math.random()*6-1+1)+1;
      int die2 = (int)(Math.random()*6-1+1)+1;
      int sum = die1+die2;

     
      System.out.printf("%d\t%d\t%d\n", die1, die2, sum);
    } 
  }
}