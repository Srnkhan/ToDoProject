package Rename;

public class PoliymorphismDemo {
    public static void main(String [] args){
        displayObject(new Circle("Black" , true , 1));
    }
    public static void displayObject(GeometricObject object){
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());

    }
}
