
import java.util.Scanner;

public class TestRectangle {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(60, 34);

        System.out.println("Length: " + r1.getLength() + " Width: " + r1.getWidth());
        System.out.println("Rectangle 1 Area: " + r1.getArea() + "\nRectangle 1 Perimeter: " + r1.getPerimeter());

        System.out.println();

        System.out.println("Length: " + r2.getLength() + " Width: " + r2.getWidth());
        System.out.println("Rectangle 2 Area: " + r2.getArea() + "\nRectangle 2 Perimeter: " + r2.getPerimeter());

        System.out.println();

        r1.setLength(23);
        r1.setWidth(27);
        System.out.println(r1.toString());
        
        System.out.println("Rectangle 1 Area: " + r1.getArea());
        System.out.println("Rectangle 1 Perimeter: " + r1.getPerimeter());
    }
}
