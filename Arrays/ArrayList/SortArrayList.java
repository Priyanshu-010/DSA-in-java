package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(3);
        l.add(2);
        l.add(10);
        l.add(16);
        l.add(8);
//        System.out.println("Original Array " + l);
//        Collections.sort(l);
//        System.out.println("Ascending Order Sorting " + l);
//        Collections.sort(l, Collections.reverseOrder());
//        System.out.println("Descending Order Soting " + l);
        
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Hello");
        l1.add("world");
        l1.add("From");
        l1.add("priyanshu");

        System.out.println("OG "+ l1);
        Collections.sort(l1);
        System.out.println("Sorted List " + l1);
    }
}
