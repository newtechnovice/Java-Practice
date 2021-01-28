public class TestCircle {
    public static void main (String [] args){
        Circle c = new Circle();
        System.out.println("Circle 1 Radius: " + c.getRadius() +
                           "\nCircle 1 Color: " + c.getColor() +
                           "\nCircle 1 Area: " + c.getArea());
        
        c.setColor("pink");
        c.setRadius(23);
        System.out.println(c.toString());

        System.out.println();
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("Circle 2 Radius: " + c1.getRadius() +
                           "\nCirlce 2 Color: " + c1.getColor() +
                           "\nCircle 2 Area: " + c1.getArea());

        System.out.println();

        Cylinder cy = new Cylinder();
        System.out.println("Cylinder 1 Radius: " + cy.getRadius() +
                           "\nCylinder 1 Height: " +cy.getHeight() +
                           "\nCylinder 1 Color: " + cy.getColor() +
                           "\nCylinder 1 Volume: " + cy.getVolume());
        
        cy.setHeight(27);
        System.out.println(cy.toString());
        
        System.out.println();
        Cylinder cy1 = new Cylinder(9.0, "green", 3.0);     
        System.out.println("Cylinder 1 Radius: " + cy1.getRadius() +
                           "\nCylinder 1 Height: " +cy1.getHeight() +
                           "\nCylinder 1 Color: " + cy1.getColor() +
                           "\nCylinder 1 Volume: " + cy1.getVolume());              
    }  
}

