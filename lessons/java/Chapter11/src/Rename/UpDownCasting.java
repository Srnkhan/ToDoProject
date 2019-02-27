package Rename;

public class UpDownCasting {
    public static void main(String[] a){
        /**
         * UpCasting Sup class type -> Super class type
         */
        Dog dog = new Dog();
        Animal anim = (Animal) dog;
        anim.eat();
        if (anim instanceof Dog){
            ((Dog) anim).bark();
        }

        /**
         * DownCasting  Super class type->sup class type
         */
       /*
        Animal anim = new Cat();
        Cat cat = (Cat) anim;
        cat.meow();
        cat.eat();*/
    }
}
interface Mammal {
    public void eat();

    public void move();

    public void sleep();
}
abstract class Animal implements Mammal {
    public void eat() {
        System.out.println("Eating...");
    }

    public void move() {
        System.out.println("Moving...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

}
class Dog extends Animal {
    public void bark() {
        System.out.println("Gow gow!");
    }
    public void eat() {
        System.out.println("Dog is eating...");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Meow Meow!");
    }}