package _11_12;

public class Circle extends GeometricObject {
    private double radius;
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        setColor(color);
        setFilled(filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getDiameter(){
        return 2 * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public void printCircle(){
        System.out.println("The circle is created " + super.getDateCreated() + " and radius is " + radius);
    }

    @Override
    public String toString() {
        return super.toString() + "\nradius is " + radius;

    }
}
