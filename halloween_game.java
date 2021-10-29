import java.util.*;
public class halloween_game{
  public static void main (String []args){
    Scanner k = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Enter a game mode:\n"+
                       "1 for Trivia\n"+
                       "2 for Guessing");
    int mode= k.nextInt();
    
    switch (mode){
      case 1:
        
        System.out.println("You have chosen Trivia");
        System.out.println("\n\n");
        
        int qu = rand.nextInt(11); // random number generator for the question
        
        if (
         System.out.println("
        
        
        
        
       break;
        
      case 2:
        
        System.out.println("You have chosen Guessing");
        
       break;
       
      default:
        System.out.println("Please pick an eligble option :-) ");  
    }
    
  }
}
