/*
Write a program that prompts a student for the number of credit hours in which the student is enrolled, 
and the amount of money spent on books. The total is $85 per credit hour, plus the amount for books, plus a $650 athletic fee.
Display the student's total fees with full details.
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class StudentFees{

    static Scanner scan = new Scanner (System.in);
    static NumberFormat nf = NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {

        String input = "Y";

        while (input.equalsIgnoreCase("Y")){
            System.out.print("Credit Hours: ");
            double creditHours = scan.nextInt();

            System.out.print("Amount for Books: ");
            double amountBooks = scan.nextDouble();

            System.out.println();
            nf = NumberFormat.getCurrencyInstance();

            System.out.println("Amount for Credit Hours: " + nf.format(85*creditHours));
            System.out.println("Books: " + nf.format(amountBooks));
            System.out.println("Athletic Fee: $650.00");

            System.out.println();

            System.out.println("TOTAL FEES: " + nf.format((85*creditHours)+amountBooks+650));

            System.out.print("Do you want to Continue? (Y|N): ");
            input = scan.next();

            if (input.equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println("End of Program!");
        
    }
}