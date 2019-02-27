package _11_12;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(1);
        GeometricObject object1 = new GeometricObject();

/*
        if ((circle instanceof GeometricObject)){
            //Run
            System.out.println(circle);
            System.out.println();
        }
        if (object1 instanceof GeometricObject){
           //Run
            System.out.println(object1);
            System.out.println();
        }
        if (circle instanceof Circle){
            //Run
            System.out.println(circle);
            System.out.println();
        }
        if (object1 instanceof Circle){
            //Not Run
        }
        */
        /**
         * UpCast
         */
        /*
        Circle circle1 = new Circle();
        GeometricObject object = circle1;
        */
        /**
         * Not Work
         */
        /*
        GeometricObject object = new GeometricObject();
        Circle circle1 = (Circle)object;
        */

        GeometricObject o = new Circle();
        o.setFilled(true);
        o.setColor("Red");
        ((Circle) o).setRadius(1.2);
        Circle c = (Circle) o;
        System.out.println(c);


    }
}
