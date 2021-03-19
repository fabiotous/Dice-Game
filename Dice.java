
package gamedice;
import java.util.Random;

public class Dice {
    String [] phrases = new String[]{"Snake Eyes", "Ballerina", "Brooklyn Forrest", "Square Pair", "Puppy Paws", "Boxcars"};
    static Random rnd = new Random();
    public static int roll()
  {
    return rnd.nextInt(6)+1;
  }
  public static String printSlang(int i, int j)
  {
      String s = "";
   
      if(i == j){
          if(i == 1){
              //System.out.println("Snake Eyes");
              s = "Snake Eyes";
          }
          else if(i == 2){
              //System.out.println("Ballerina");
              s = "Ballerina";
          }
          else if(i == 3){
              //System.out.println("Brooklyn Forrest");
              s = "Brooklyn Forrest";
          }
          else if(i == 4){
              //System.out.println("Square Pair");
              s = "Square Pair";
          }
          else if(i == 5){
              //System.out.println("Puppy Paws");
              s = "Puppy Paws";
          }
          else if(i == 6){
              //System.out.println("Box Cars");
              s = "Box Cars";
          }
      }
      return s;
  }
}
