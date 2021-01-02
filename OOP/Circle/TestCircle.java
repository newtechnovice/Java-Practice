public class TestCircle {
    public static void main (String [] args){
        Circle c = new Circle();

        System.out.println("The circle has a radius of " + c.getRadius() + " and the area of " + c.getArea());

        Circle c1 = new Circle(2.0);

        System.out.println("The circle has a radius of " + c1.getRadius() + " and the area of " + c1.getArea());
    }
    
}
