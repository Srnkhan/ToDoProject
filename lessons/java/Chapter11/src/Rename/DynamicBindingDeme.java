package Rename;

public class DynamicBindingDeme {
    public static void main(String[] args){
        System.out.println("1");
        m(new GraduateStudent());
        System.out.println("2");
        m(new Student());
        System.out.println("3");
        m(new Person());
        System.out.println("4");
        m(new Object());


    }
    public static void m(Object x){
        System.out.println(x.toString());
    }

}
        class GraduateStudent extends Student{

        }
        class Student extends Person{
            public Student() {
                System.out.println("Student Place");
            }

            @Override
            public String toString() {
                return "Student";
            }
        }
        class Person extends Object{
            public Person() {
                System.out.println("person place");
            }

            @Override
            public String toString() {
                return "Person";
            }
        }