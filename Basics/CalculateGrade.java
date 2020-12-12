/* Create a java program that will compute your semestral grade (2 decimal places) given the
user-inputted Prelim, Midterm and Final Grades. */

import java.util.Scanner;
import java.text.NumberFormat;

public class CalculateGrade {
    static Scanner scan = new Scanner (System.in);
    static NumberFormat nf = NumberFormat.getNumberInstance();
    public static void main (String [] args){

        String input = "Y";

        while (input.equalsIgnoreCase("Y")){

            userInput();

            System.out.print("\nDo you want to continue? (Y|N): ");
            input = scan.next();

            if (input.equalsIgnoreCase("N")) break;

        }
        System.out.println("End of Program!");
    }

    public static double computeGrade(double prelimGrade, double midtermGrade, double finalsGrade){

        double result = (prelimGrade + midtermGrade + finalsGrade)/3;
        return result;

    }

    public static double userInput(){

            System.out.print("Prelim: ");
            double prelimGrade = scan.nextDouble();

            System.out.print("Midterm: ");
            double midtermGrade = scan.nextDouble();

            System.out.print("Finals: ");
            double finalsGrade = scan.nextDouble();

            double solution = computeGrade(prelimGrade, midtermGrade, finalsGrade);
            nf.setMinimumFractionDigits(2);
            nf.setMaximumFractionDigits(2);
            System.out.println("Semestral Grade: " + nf.format(solution));
            
            return solution;
    }

}
