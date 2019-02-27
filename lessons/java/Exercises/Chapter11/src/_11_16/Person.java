package _11_16;

public class Person {
    private String Name , Age;
    int ID;

    public Person(String name, String age, int ID) {
        Name = name;
        Age = age;
        this.ID = ID;
    }


    public String getName() {
        return Name;
    }

    public String getAge() {
        return Age;
    }

    public int getID() {
        return ID;
    }
}
