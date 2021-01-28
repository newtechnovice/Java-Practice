/*This class is a "building block" and is meant to be used in another program */
public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
        color = "red";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String toString(){
        return "Cirlce[radius = "+ radius + " color = "+ color +"]";
    }
}

class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        height = 1.0;
    }

    public Cylinder(double radius){
        super(radius);
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }    

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return height*getArea();
    }

    @Override
    public String toString(){
        return "Cylinder[height = "+ height +"]";
    }
}
