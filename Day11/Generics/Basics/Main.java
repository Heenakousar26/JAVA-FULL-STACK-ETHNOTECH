package Day11.Generics.Basics;

import Day11.Generics.Basics.Content;
import Day11.Generics.Basics.Item;

public class Main {
    public static void main(String[] args){
        Day11.Generics.Basics.Content<String> c=new Content<>();
        c.setName("Heena");
        System.out.println(c.getName());

        Day11.Generics.Basics.Item<String,Double,Boolean> i=new Item("banana",10.3,true);
        System.out.println(i.getName()+" "+i.getB()+" "+i.getD());

    }
}


