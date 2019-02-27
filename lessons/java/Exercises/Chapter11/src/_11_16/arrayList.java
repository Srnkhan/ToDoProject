package _11_16;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class arrayList {
    private static List<Person> persons = new ArrayList<Person>();

    public static void main(String[] args){
        for (int i = 0 ; i < 10 ; i++){
            persons.add(new Person("Ali" , String.valueOf(i) , i*10));
        }
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(persons.get(i).getID() + persons.get(i).getName()+ persons.get(i).getAge());
        }
        ArrayList list2 = new ArrayList();
        list2.add("Denver");
        list2.add("Austin");
        list2.add(new Date());
        String data = (String) list2.get(0);
        System.out.println(data);
       // list2.set( 3, "Dallas" );
       // System.out.println(list2.get( 3 ));
    }

}
