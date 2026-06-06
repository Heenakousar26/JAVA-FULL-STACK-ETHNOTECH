package Day09.Collections;

import java.util.LinkedHashSet;
public class HashSet {
    public static void main(String[] args){
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("hggv");
        set.add("bhjbdj");
        set.add("hggv");
        set.add("john");
        System.out.println(set);
        set.remove("hggv");
        System.out.println(set);
        System.out.println(set.contains("hggv"));
        System.out.println(set.contains("john"));


    }


}
