import java.util.Scanner;

public class MinutesAp {
    static Scanner scan = new Scanner (System.in);

    public static void main(String[] args) {

        String input = "Y";

        while (input.equalsIgnoreCase("Y")){
            System.out.print("Enter Minutes: ");
            int minutes = scan.nextInt();

            int hour = minutes/60;
            int mins = minutes%60;

            System.out.println(
                ((hour >= 1)? hour + " Hours ": "") + ((mins > 1)? mins + " Minutes" : mins + " Minute")
            );

            System.out.print("\nDo you want to continue? (Y|N): ");
            input = scan.next();

            if (input.equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println("End of Program!");
    }
}
