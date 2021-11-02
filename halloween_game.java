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
        
              //int qu =0;
        if (qu == 0){
          System.out.println("Only one holiday surpasses Halloween in annual consumer sales. What is it?");
            String rightAnswer= "Christmas";
            k.nextLine();
            String answer = k.nextLine();
            

            while (!answer.equalsIgnoreCase(rightAnswer)){

                   System.out.println("Your answer is wrong. Try again.");
                   System.out.println("\n");
                   System.out.println("Only one holiday surpasses Halloween in annual consumer sales. What is it?");
                   answer = k.nextLine();
            }
            System.out.print("\nCorrect!");
          }
        
        else if (qu == 1){
          System.out.println("What was candy corn originally called?");
           String rightAnswer= "Chicken feed";
           k.nextLine();
            String answer = k.nextLine();
            

            while (!answer.equalsIgnoreCase(rightAnswer)){

                   System.out.println("Your answer is wrong. Try again.");
                   System.out.println("\n");
                   System.out.println("What was candy corn originally called?");
                   answer = k.nextLine();
            }
            System.out.print("\nCorrect!");
          }
        
        else if (qu==2){
          System.out.println("What famous magician died on Halloween?");
          String rightAnswer= "Harry Houdini";
          k.nextLine();
           String answer = k.nextLine();
           

           while (!answer.equalsIgnoreCase(rightAnswer)){

                  System.out.println("Your answer is wrong. Try again.");
                  System.out.println("\n");
                  System.out.println("What famous magician died on Halloween?");
                  answer = k.nextLine();
           }
           System.out.print("\nCorrect!");
         }
        
        
        else if (qu==3){
          System.out.println("What is the most commercially successful horror movie of all time?");
          String rightAnswer= "It";
          k.nextLine();
           String answer = k.nextLine();
           

           while (!answer.equalsIgnoreCase(rightAnswer)){

                  System.out.println("Your answer is wrong. Try again.");
                  System.out.println("\n");
                  System.out.println("What is the most commercially successful horror movie of all time");
                  answer = k.nextLine();
           }
           System.out.print("\nCorrect!");
         }
        
        
        else if (qu==4){
          System.out.println("Where was the first city-wide Halloween celebration in the United States?");
          String rightAnswer= "Anoka, Minnesota";
          k.nextLine();
           String answer = k.nextLine();
           

           while (!answer.equalsIgnoreCase(rightAnswer)|| !answer.equalsIgnoreCase("Anoka Minnesota")){

                  System.out.println("Your answer is wrong. Try again.");
                  System.out.println("\n");
                  System.out.println("Where was the first city-wide Halloween celebration in the United States?");
                  answer = k.nextLine();
           }
           System.out.print("\nCorrect!");
         }
        
        
        else if (qu==5){
          System.out.println("What candy was given to soldiers in battle in the Korean War?");
          String rightAnswer= "Tootsie Rolls";
          k.nextLine();
           String answer = k.nextLine();
           

           while (!answer.equalsIgnoreCase(rightAnswer)){

                  System.out.println("Your answer is wrong. Try again.");
                  System.out.println("\n");
                  System.out.println("What candy was given to soldiers in battle in the Korean War?");
                  answer = k.nextLine();
           }
           System.out.print("\nCorrect!");
         }
        
        
        else if (qu==6){
          System.out.println("What is the most commercially successful horror franchise of all time?");
          String rightAnswer= "Godzilla";
          k.nextLine();
           String answer = k.nextLine();
           

           while (!answer.equalsIgnoreCase(rightAnswer)){

                  System.out.println("Your answer is wrong. Try again.");
                  System.out.println("\n");
                  System.out.println("What is the most commercially successful horror franchise of all time?");
                  answer = k.nextLine();
           }
           System.out.print("\nCorrect!");
         }
        
        
        else if (qu==7){
          System.out.println("What horror movie was the first American film ever to show a toilet on screen?");
          String rightAnswer= "Psycho";
          k.nextLine();
           String answer = k.nextLine();
           

           while (!answer.equalsIgnoreCase(rightAnswer)){

                  System.out.println("Your answer is wrong. Try again.");
                  System.out.println("\n");
                  System.out.println("What horror movie was the first American film ever to show a toilet on screen");
                  answer = k.nextLine();
           }
           System.out.print("\nCorrect!");
         }
        
        
        else if (qu==8){
          System.out.println("In what American state is it illegal to be a priest or nun for Halloween?");
          String rightAnswer= "Alabama";
          k.nextLine();
           String answer = k.nextLine();
           

           while (!answer.equalsIgnoreCase(rightAnswer)){

                  System.out.println("Your answer is wrong. Try again.");
                  System.out.println("\n");
                  System.out.println("In what American state is it illegal to be a priest or nun for Halloween?");
                  answer = k.nextLine();
           }
           System.out.print("\nCorrect!");
         }
        
        
        else if (qu==9){
          System.out.println("What is the most popular Halloween candy in America?");
          String rightAnswer= "Skittles";
          k.nextLine();
           String answer = k.nextLine();
           

           while (!answer.equalsIgnoreCase(rightAnswer)){

                  System.out.println("Your answer is wrong. Try again.");
                  System.out.println("\n");
                  System.out.println("What is the most popular Halloween candy in America?");
                  answer = k.nextLine();
           }
           System.out.print("\nCorrect!");
         }
        
        
      //  // else if (qu==10){
      //  //     System.out.println("What was the original title for Disney's Hocus Pocus?");
      //  String rightAnswer= "Chicken feed";
      //      k.nextLine();
      //       String answer = k.nextLine();
            

      //       while (!answer.equalsIgnoreCase(rightAnswer)){

      //              System.out.println("Your answer is wrong. Try again.");
      //              System.out.println("\n");
      //              System.out.println("What was candy corn originally called?");
      //              answer = k.nextLine();
      //       }
     // System.out.print("\nCorrect!");
      //     }
      
        
        else   {
          System.out.println("What ancient Roman goddess is said to be honored on Halloween?");
          String rightAnswer= "Pomona";
          k.nextLine();
           String answer = k.nextLine();
           

           while (!answer.equalsIgnoreCase(rightAnswer)){

                  System.out.println("Your answer is wrong. Try again.");
                  System.out.println("\n");
                  System.out.println("What ancient Roman goddess is said to be honored on Halloween?");
                  answer = k.nextLine();
           }
           System.out.print("\nCorrect!");
         }
        
        
        
        
        
       break;
        
      case 2:
        
        System.out.println("You have chosen Guessing");
        
       break;
       
      default:
        System.out.println("Please pick an eligble option :-) ");  
    }
    
  }
}
