import java.util.InputMismatchException;
import java.util.Scanner;

public class GettingValidInput {
    static Scanner scan = new Scanner(System.in);
    public static void main (String []args){

        System.out.print("Enter number: ");
        int number = getInteger();

        System.out.println("You entered " + number);

    }   
    
    public static int getInteger(){
        while(true){
            try {
                return scan.nextInt();
            }

            catch(InputMismatchException e){

                /* The next method must be called in the catch block to dispose of the user’s invalid input 
                because the nextInt method leaves the input value in the Scanner’s input stream if an 
                InputMismatchException is thrown. If you omit the statement that calls next, the while loop keeps 
                reading it, throws an exception, and displays an error message in an infinite loop. */

                scan.next();
                System.out.print("That is not an integer. Try again: ");
                
            }
        }
    }
}
