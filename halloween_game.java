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
        
        if (qu == 0)
         System.out.println("Only one holiday surpasses Halloween in annual consumer sales. What is it?");
        
        else if (qu==1)
          System.out.println("What was candy corn originally called?");
        
        else if (qu==2)
          System.out.println("What famous magician died on Halloween?");
        
        else if (qu==3)
          System.out.println("What is the most commercially successful horror movie of all time?");
        
        else if (qu==4)
          System.out.println("Where was the first city-wide Halloween celebration in the United States?");
        
        else if (qu==5)
          System.out.println("What candy was given to soldiers in battle in the Korean War?");
        
        else if (qu==5)
          System.out.println("What is the most commercially successful horror franchise of all time?");
        
        else if (qu==6)
          System.out.println("What horror movie was the first American film ever to show a toilet on screen?");
        
        else if (qu==7)
          System.out.println("In what American state is it illegal to be a priest or nun for Halloween?");
        
        else if (qu==8)
          System.ouut.println("");
        
       break;
        
      case 2:
        
        System.out.println("You have chosen Guessing");
        
       break;
       
      default:
        System.out.println("Please pick an eligble option :-) ");  
    }
    
  }
}
