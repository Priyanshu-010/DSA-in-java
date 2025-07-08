package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println("Original Array" + l);
        reverseList(l);

        //Other Method(In Built Methhod)
//        Collections.reverse(l);
        System.out.println("Reverse Array" + l);
    }
    static void reverseList(ArrayList<Integer> l){
        int i = 0, j = l.size() -1;
        while(i<j){
            Integer temp = Integer.valueOf(l.get(i));
            l.set(i,l.get(j));
            l.set(j,temp);
            i++;
            j--;
        }
    }
}
