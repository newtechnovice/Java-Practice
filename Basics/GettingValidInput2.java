import java.util.Scanner;

public class GettingValidInput2 {
    static Scanner scan = new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter number: ");
        int number = getInteger();

        System.out.println("You entered: " + number);
    }

    public static int getInteger(){

        while (! scan.hasNextInt()){                                    //hasNextInt() returns true if the input is int value
            scan.next();
            System.out.print("That is not an integer. Try again: ");
        }
        return scan.nextInt();
    }
}
