package Rename;

import java.util.ArrayList;

public class myStack {
    private static ArrayList list = new ArrayList();
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(getSize() - 1);
    }
    public Object pop(){
        Object o = list.get(list.size() -1 );
        list.remove(0);
        return o;
    }


    public static void main(String[] args){
        list.add(new Circle(1.2));
        list.add(new Circle(2.4));
        System.out.println(((Circle)list.get(0)).getArea());

        System.out.println(((Circle)list.get(1)).getArea());
    }
}
