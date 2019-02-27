package Rename;

import java.time.Period;
import java.util.ArrayList;

public class arrayList {
    private static ArrayList cityList;
    public static void main(String[] args){
        cityList = new ArrayList();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println("List size: " + cityList.size());
        System.out.println( "Is Miami in the list? " +cityList.contains( "Miami" ) );
        System.out.println("Is the list empty? " + cityList.isEmpty());
        cityList.remove("Denver");
        for (int i = cityList.size() -1 ; i >= 0 ; i--){
            System.out.println(cityList.get(i).toString());
        }
        ArrayList<Circle> circlelist = new ArrayList<Circle>();
        circlelist.add(new Circle(2.4));
        System.out.println(circlelist.get(0).getArea());


    }
}
