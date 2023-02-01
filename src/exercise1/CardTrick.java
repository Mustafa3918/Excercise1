package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Mustafa Khan Jan 31, 2023
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
        

        Random random = new Random();
        
        
        
        Card[] hand = new Card[7];
           for(int i=0; i<hand.length; i++){ 
               hand[i] = new Card();
          //card.setValue(insert call to random number generator here)
            hand[i].setValue(random.nextInt(13));
            
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
          hand[i].setSuit(Card.SUITS[random.nextInt(2)]);       
            
         
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
           }
           
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the value 1-13");
           int value1= sc.nextInt();
           
           Scanner sc1 = new Scanner(System.in);
           System.out.println("Enter a suit");
           String name = sc1.nextLine();
           
           for(int i =0; i<hand.length; i++){
           
           
               if(hand[i].getValue()==value1 && hand[i].getSuit().equals(name))
               {
               System.out.println("You have correctly guessed the card in the array");
               printInfo();
               
               }
               
               else{
                   System.out.println("Your guess was wrong");
               
               }
           }
           
            
        }
        
        

     
    // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    


    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * @author Mustafa Khan Jan 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Mustafa");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Learn most languages");
        System.out.println("-- Fullstack developer");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Driving");
        System.out.println("-- Vacations");
        System.out.println("-- Talking");

        System.out.println();
        
    
}

}
