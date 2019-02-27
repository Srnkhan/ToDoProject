package Rename;

public class CastingDemo {
    public static void main(String[] args){
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1,1);
        displayObject(object1);
        displayObject(object2);
        //Downcasting
        GeometricObject g = new Rectangle();
        Rectangle r = new Rectangle();
        g = (Rectangle)r;
        System.out.println(g.getColor());

        GeometricObject g2 = new Rectangle();
        Rectangle r2 = new Rectangle();
        g2 = (Rectangle)r2;
        g2.getColor();
        Test();
    }
    public static void displayObject(Object object){

        if (object instanceof Circle){
            System.out.println("The Circle Area is " + ((Circle)object).getArea());
           System.out.println("The circle diameter is " + ((Circle)object).getDiameter());
        }
        else if (object instanceof Rectangle){
            System.out.println("The rectangle area is " + ((Rectangle)object).getArea());
        }


    }
    public static void Test(){
        Object x = new Object();
        x = new GeometricObject();
        Object y = new Rectangle();
        y = (Rectangle)y;
    }
}
