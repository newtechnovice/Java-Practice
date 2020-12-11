/* Simple number guessing game 

Computer picks a number between 1 to 20 and you have to guess the number. After you guess, the computer tells
whether you're right or wrong and then asks whether you want to play again. */

import java.util.Scanner;

public class GuessingGame {
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {

        String input = "Y";

        while (input.equalsIgnoreCase("Y")){

            int random = (int)(Math.random()*20)+1;
            System.out.println("I'm thinking of a number between 1 and 20.");
            
            System.out.print("Take a guess: ");
            int guessNumber = scan.nextInt();

            String result = (guessNumber == random) ? "\nYou're right!\n" : "\nYou're wrong! The number was "+ random + ".\n";
            System.out.println(result);

            System.out.println("Everytime you try again the number changes.");
            System.out.print("Do you want to try again? (Y|N): ");
            input = scan.next();
            
            if (input.equalsIgnoreCase("N")){
                break;
            }
    
        } 
        System.out.println("\nThanks for playing!");
    }

}
