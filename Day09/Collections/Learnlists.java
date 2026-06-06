package Day09.Collections;

import java.util.ArrayList;

public class Learnlists {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(10);
        list.add("beat it");
        list.add("Despacito");
        list.add("Gangam style");
        list.add("kolaveri Di");
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        for(String s:list){
            System.out.println(s);
        }
        System.out.println(list);
    }
}
