import java.util.Scanner;

public class TestInvoiceItem {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Description: ");
        String desc = scan.nextLine();

        System.out.print("ID: ");
        String idNum = scan.next();

        System.out.print("Quantity: ");
        int qty = scan.nextInt();

        System.out.print("Price: ");
        double unitPrice = scan.nextDouble();

        InvoiceItem item = new InvoiceItem(idNum, desc, qty, unitPrice);

        System.out.println("\nID: " + item.getID() +
                           "\nDescription: " + item.getDesc() +
                           "\nQuantity: " + item.getQty() +
                           "\nUnit Price: " + item.getUnitPrice() +
                           "\nTotal: " + item.getTotal());

        System.out.println();

        item.setQty(10);
        item.setUnitPrice(29.75);
        System.out.println(item.toString());
        System.out.println("Total: " + item.getTotal());
    }
}
