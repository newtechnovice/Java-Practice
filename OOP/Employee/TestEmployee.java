import java.util.Scanner;
import java.text.NumberFormat;

public class TestEmployee {
    static Scanner scan = new Scanner(System.in);
    static NumberFormat cf = NumberFormat.getCurrencyInstance();
    public static void main(String [] args){
        System.out.print("Employee ID: ");
        int id = scan.nextInt();

        System.out.print("First Name: ");
        String firstName = scan.next();

        System.out.print("Last Name: ");
        String lastName = scan.next();

        System.out.print("Salary: ");
        int salary = scan.nextInt();

        System.out.print("Salary Increase (%): ");
        double percent = scan.nextDouble();

        Employee employeeX = new Employee(id, firstName, lastName, salary);

        System.out.println("\n=======================\n");

        System.out.println("Employee First Name: " + employeeX.getFirstName());
        System.out.println("Employee Last Name: " + employeeX.getLastName());
        System.out.println("Employee Name: " + employeeX.getName());
        System.out.println("Employee ID: " + employeeX.getID());
        System.out.println("Employee Salary: " + cf.format(employeeX.getSalary()));
        System.out.println("Employee Annual Salary: " + cf.format(employeeX.getAnnualSalary()));
        System.out.println("Employee Salary Increase (" + percent + "%): " + cf.format(employeeX.raiseSalary(percent)));
    }
}
