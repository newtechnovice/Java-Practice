abstract class Shape {
    protected String color;
    protected Boolean filled;

    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();
    
    public String toString(){
        return "Shape[color = " + color + " filled = " + filled + "]";
    }
}

class Circle extends Shape{
    protected double radius;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.filled = filled;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString(){
        return "Circle[" + super.toString() + ", radius = " + radius + "]";
    }
}

class Rect extends Shape{
    protected double width;
    protected double length;

    public Rect(){
        width = 1.0;
        length = 1.0;
    }

    public Rect(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rect(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;       
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        return width*length;
    }

    @Override
    public double getPerimeter(){
        return 2*(length + width);
    }

    @Override
    public String toString(){
        return "Rectangle[" + super.toString() + ", width = " + width + ", length = " + length +"]";
    }
}

class Square extends Rect{
    protected double side;

    public Square(){
        super();
        side = 1.0;
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    @Override
    public void setWidth(double side){
        super.width = side;
    }

    @Override
    public void setLength(double side){
        super.length = side;
    }

    @Override
    public String toString(){
        return "Square[" + super.toString() + "]";
    }

}


//Driver Code
public class Geometry {
    public static void main(String[] args) {
        Circle circleObj = new Circle();
        System.out.println(circleObj.toString());

        circleObj.setRadius(2.0);
        circleObj.setColor("none");
        circleObj.setFilled(false);
        System.out.println(circleObj.toString());
        System.out.println("Perimeter: " + circleObj.getPerimeter() + "\nArea: " + circleObj.getArea());

        System.out.println();

        Rect rectObj = new Rect();
        System.out.println(rectObj.toString());

        rectObj.setWidth(23.0);
        rectObj.setLength(19.0);
        rectObj.setColor("Green");
        rectObj.setFilled(true);
        System.out.println(rectObj.toString());
        System.out.println("Perimeter: " + rectObj.getPerimeter() + "\nArea: " + rectObj.getArea());

        System.out.println();

        Square sqObj = new Square(9.0, "Purple", true);
        System.out.println(sqObj.toString());

        sqObj.setWidth(6);
        sqObj.setLength(6);
        sqObj.setColor("Blue");
        System.out.println(sqObj.toString());
    }  
}
