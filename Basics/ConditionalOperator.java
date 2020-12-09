import java.util.Scanner;
import java.text.NumberFormat;

public class ConditionalOperator {

    static Scanner scan = new Scanner(System.in);
    static NumberFormat cf = NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {
        
        String input = "Y";
        while(input.equalsIgnoreCase("Y")){

            System.out.print("Sales: ");
            double sales = scan.nextDouble();

            System.out.print("Sales Rep (Class): ");
            double salesRep = scan.nextDouble();

            cf = NumberFormat.getCurrencyInstance();

            if (sales <= 9999){
                double result = (salesRep == 1) ? (100 * 0.02) : (100 * 0.025);
                System.out.println(cf.format(result)); 
            }

            else{
                double resultTwo = (salesRep == 1) ? (100 * 0.04) : (100 * 0.05);
                System.out.println(cf.format(resultTwo));
            }

            System.out.print("Do you want to continue? (Y|N): ");
            input = scan.next();

            if (input.equalsIgnoreCase("N"))
                break;
        }
        System.out.println("End of Program!");
     
    }
    
}
